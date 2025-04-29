package irvine.oeis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;

import irvine.math.z.Z;

/**
 * Layout the content of <code>stripped.gz</code> in the format needed for tests.
 * @author Sean A. Irvine
 */
public final class Stripped {

  private Stripped() { }

  private static final int A_NUMBER_LENGTH = 6;

  private static List<Z> toSeq(final String line) {
    final String[] parts = line.split(",");
    final ArrayList<Z> res = new ArrayList<>(parts.length);
    for (final String z : parts) {
      if (!z.isEmpty()) {
        res.add(new Z(z));
      }
    }
    return res;
  }

  private static List<List<Z>> loadSequences(final String strippedFile) throws IOException {
    final ArrayList<List<Z>> names = new ArrayList<>();
    try (final FileInputStream f = new FileInputStream(strippedFile);
         final BufferedReader reader = new BufferedReader(new InputStreamReader(strippedFile.endsWith(".gz") ? new GZIPInputStream(f) : f, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (!line.isEmpty() && !line.startsWith("#")) {
          final int n = Integer.parseInt(line.substring(1, A_NUMBER_LENGTH + 1));
          // There can be some gaps in the names file (for not yet allocated sequences etc.)
          while (n > names.size()) {
            names.add(Collections.singletonList(Z.ZERO)); // Make dummy entries for as yet non-existent sequences
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

  /**
   * Explode out the stripped sequences file.
   * @param args jOEIS home directory
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    if (args.length != 1) {
      System.err.println("Usage: joeis-home-dir");
      return;
    }
    final String home = args[0];
    final List<List<Z>> sequences = loadSequences(Paths.get(home, "test", "irvine", "oeis", "stripped.gz").toString());
    System.out.println("Loaded: " + sequences.size());
    final File outdir = Paths.get(home, "test", "irvine", "oeis", "seq").toFile();
    if (!outdir.exists() && !outdir.mkdirs()) {
      throw new IOException("Could not make " + outdir);
    }
    for (int block = 0, k = 0; k < sequences.size(); ++block, k += 1000) {
      final String f = "000" + block;
      System.out.println("Expanding block " + block);
      try (final PrintStream out = new PrintStream(new File(outdir, f.substring(f.length() - 3)))) {
        for (int j = 0, i = k; j < 1000 && i < sequences.size(); ++j, ++i) {
          final StringBuilder sb = new StringBuilder();
          for (final Z v : sequences.get(i)) {
            sb.append(v);
            sb.append(',');
          }
          out.println(sb);
        }
      }
    }
  }
}

