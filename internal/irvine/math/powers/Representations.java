package irvine.math.powers;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Find representations of a number in terms of positive powers.  This is only
 * useful for checking isolated values.
 * @author Sean A. Irvine
 */
final class Representations {

  private Representations() {
  }

  private static void search(final long[] t, final Z a, final int exponent, final int pos, final long m) {
    if (pos == t.length) {
      if (a.isZero()) {
        System.out.println(Arrays.toString(t));
      }
      return;
    }
    Z c;
    for (long v = m; (c = Z.valueOf(v).pow(exponent)).compareTo(a) <= 0; ++v) {
      t[pos] = v;
      search(t, a.subtract(c), exponent, pos + 1, v);
    }
  }

  /**
   * Main program.
   * @param args see Usage.
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.err.println("Usage: Representations power terms number");
      return;
    }
    final int power = Integer.parseInt(args[0]);
    final int terms = Integer.parseInt(args[1]);
    final Z n = new Z(args[2]);
    final long[] t = new long[terms];
    search(t, n, power, 0, 1);
  }

}
