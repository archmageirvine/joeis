package irvine.oeis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Channels;

import irvine.util.string.Date;

/**
 * Generate a report on implemented sequences.
 * @author Georg Fischer
 */
public final class OffsetInspector {

  /** Empty constructor */
  private OffsetInspector() { 
  }

  /**
   * Main program.
   * @param args name of file with pairs A-number offset
   */
  public static void main(final String[] args) {
    System.out.println("# Starting report at " + Date.now());
    int iarg = 0;
    String fileName = "-"; // default: read from STDIN
    if (args.length > 0) {
      fileName = args[iarg++];
    }
    if (fileName.matches("\\-\\-?h(elp)?")) {
      System.out.print("Usage: java irvine.oeis.OffsetInspector {- | filename}\n"
          + "    file contains tab-separated tuples: A-number, offset, superclass\n"
          );
      return;
    }
    final String srcEncoding = "UTF-8"; // Encoding of the input file
    String line; // current line from text file
    int total = 0;
    int pass = 0;
    int fail = 0;
    try {
      try (final BufferedReader lineReader = fileName.length() <= 0 || fileName.equals("-")
        ? new BufferedReader(new InputStreamReader(System.in, srcEncoding))
        : new BufferedReader(Channels.newReader(new FileInputStream(fileName).getChannel(), srcEncoding))) {
        while ((line = lineReader.readLine()) != null) { // read and process lines
          if (!line.matches("\\s*#.*")) { // is not a comment
            ++total;
            final String[] parms = line.split("\\s+");
            final String aNumber = parms[0];
            try {
              final int offset = Integer.parseInt(parms[1]);
              final String superClass = parms.length > 2 ? parms[2] : "";
              final Sequence seq = SequenceFactory.sequence(aNumber);
              final int seqOffset = seq.getOffset();
              if (seqOffset == offset) {
                ++pass;
              } else {
                ++fail;
                System.out.println(aNumber + "\t" + seqOffset + " -> " + offset + "\t" + superClass);
              }
            } catch (final NumberFormatException e) {
              System.out.println(aNumber + " skipped because offset " + parms[1] + " is out of range");
            } catch (final UnimplementedException exc) {
              //System.out.println("# " + aNumber + " nyi");
            } catch (final RuntimeException exc) {
              System.out.println("#?? " + aNumber + ": " + exc.getMessage());
            }
          } // is not a comment
        } // while ! eof
      }
    } catch (final RuntimeException | IOException exc) {
      System.err.println(exc.getMessage());
    }
    System.out.println("# " + String.format("%6d", total) + " sequences in jOEIS");
    System.out.println("# " + String.format("%6d", pass) + " with valid offset");
    System.out.println("# " + String.format("%6d", fail) + " with wrong offset");
    System.out.println("# End at " + Date.now());
  }
}

