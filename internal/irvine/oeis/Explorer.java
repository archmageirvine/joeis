package irvine.oeis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;

import irvine.math.z.Z;

/**
 * Explore various transforms of existing sequences.
 * @author Sean A. Irvine
 */
public final class Explorer {

  private static final int A_NUMBER_LENGTH = 6;
  private static final int MIN_MATCH = 10;

  private Explorer() { }

  private static List<Z> toSeq(final String line) {
    final String[] parts = line.split(",");
    final ArrayList<Z> res = new ArrayList<>(parts.length);
    for (final String z : parts) {
      if (!z.isEmpty()) {
        res.add(new Z(z));
      }
    }
    // To reduce false-positives require a minimum number of terms in a sequence
    return res.size() >= MIN_MATCH ? res : Collections.emptyList();
  }

  private static List<List<Z>> loadSequences(final String namesFile) throws IOException {
    final ArrayList<List<Z>> names = new ArrayList<>();
    names.add(Collections.emptyList()); // 0th sequence not used
    try (final FileInputStream f = new FileInputStream(namesFile);
         final BufferedReader reader = new BufferedReader(new InputStreamReader(namesFile.endsWith(".gz") ? new GZIPInputStream(f) : f, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (!line.isEmpty() && !line.startsWith("#")) {
          final int n = Integer.parseInt(line.substring(1, A_NUMBER_LENGTH + 1));
          // There can be some gaps in the names file (for not yet allocated sequences etc.)
          while (n > names.size()) {
            names.add(Collections.emptyList()); // Make dummy entries for as yet non-existent sequences
          }
          if (n != names.size()) {
            throw new IOException("Number mismatch in " + line + " (expected A" + names.size() + ")");
          }
          names.add(toSeq(line.substring(A_NUMBER_LENGTH + 2)));
        }
      }
    }
    return names;
  }

  private static List<Z> transform(final List<Z> seq) {
    final ArrayList<Z> res = new ArrayList<>(seq.size());
    //final MobiusTransformSequence transform = new MobiusTransformSequence(new FiniteSequence(seq), 0);
    final PartialSumSequence transform = new PartialSumSequence(new PrependSequence(new FiniteSequence(seq), 0));
    for (int k = 0; k < seq.size(); ++k) {
      res.add(transform.next());
    }
    return res;
  }

  private static String aNumber(final int a) {
    final String t = "00000" + a;
    return "A" + (t.substring(t.length() - A_NUMBER_LENGTH));
  }

  private static int match(final List<Z> query, final List<Z> seq) {
    // todo handle off by 1 etc.
    for (int k = 0; k < Math.min(query.size(), seq.size()); ++k) {
      if (!query.get(k).equals(seq.get(k))) {
        return 0;
      }
    }
    return Math.min(query.size(), seq.size());
  }

  /**
   * Explore transforms of sequences.
   * @param args stripped archive
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    if (args.length != 1) {
      System.err.println("Usage: Explorer stripped.gz");
      return;
    }
    final String strippedFile = args[0];
    final List<List<Z>> sequences = loadSequences(strippedFile);
    System.out.println("Loaded: " + sequences.size());
    for (int k = 1; k < sequences.size(); ++k) {
      final List<Z> t = transform(sequences.get(k));
      for (int j = 1; j < sequences.size(); ++j) {
        if (match(t, sequences.get(j)) > MIN_MATCH) {
          System.out.println(aNumber(k) + " " + aNumber(j));
        }
      }
    }
  }
}

