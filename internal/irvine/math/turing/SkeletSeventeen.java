package irvine.math.turing;

import java.util.Arrays;

/**
 * Skelet #17: checked tape schemas and uniform dyadic ladder certificate.
 * @author Gregory Morse
 */
final class SkeletSeventeen {
  private static final int[] RULES = {7, -1, 8, 19, 12, 10, 3, 6, 5, 1};

  private SkeletSeventeen() { }

  private static String tape(final int[] counts) {
    final StringBuilder tape = new StringBuilder();
    for (int i = 0; i < counts.length; ++i) {
      if (i > 0) {
        tape.append('1');
      }
      tape.append("01".repeat(counts[i]));
    }
    return tape.append('!').toString();
  }

  private static int[] rung(final int k) {
    final int[] out = new int[2 * k + 2];
    for (int i = 1; i < out.length - 1; ++i) {
      out[i] = 1 << (2 * k + 1 - i);
    }
    return out;
  }

  private static boolean tapeSchemas() {
    final String[][] schemas = {
      {"1R", "U", "10V", "1R", "01U", "V"},             // B sweeps one pair right
      {"2L", "0101U", "V", "2L", "U", "1010V"},         // C sweeps two pairs left
      {"2L", "1U", "V", "2L", "U", "1V"},             // even group delimiter
      {"2L", "011U", "V", "1R", "101U", "V"},           // odd group turns
      {"1R", "U", "110V", "1R", "101U", "V"},           // transfer nonempty right group
      {"1R", "U", "1!", "2L", "01U", "!"},             // empty low group is dropped
      {"1R", "U", "!", "2L", "U", "!"},                // end of ordinary return
      {"2L", "!", "V", "1R", "11!", "V"},              // even far end
      {"2L", "01!", "V", "1R", "0110111!", "V"},        // odd far end
    };
    for (int i = 0; i < schemas.length; ++i) {
      final String[] s = schemas[i];
      if (!ShiftOverflow.rawPath(RULES, new ShiftOverflow.Position(s[0].charAt(0) - '0', s[0].endsWith("R"), s[1], s[2]),
        new ShiftOverflow.Position(s[3].charAt(0) - '0', s[3].endsWith("R"), s[4], s[5]))) {
        System.out.println("Skelet #17: tape schema " + i + " failed");
        return false;
      }
    }
    return ShiftOverflow.rawPath(RULES, new ShiftOverflow.Position(0, true, "!", "!"),
      new ShiftOverflow.Position(2, false, tape(rung(1)), "!"));
  }

  static boolean closes(final int[] rules) {
    if (!Arrays.equals(rules, RULES)) {
      return false;
    }
    final long start = System.nanoTime();
    try {
      if (!tapeSchemas()) {
        return false;
      }
      final int cases = DyadicProof.Ladder.verify();
      System.out.printf(java.util.Locale.ROOT, "Skelet #17: 9 tape schemas and %d all-width arithmetic cones checked in %.6f s%n",
        cases, (System.nanoTime() - start) / 1e9);
      return true;
    } catch (final IllegalArgumentException failure) {
      System.out.println("INCONCLUSIVE Skelet #17: " + failure.getMessage());
      return false;
    }
  }

}
