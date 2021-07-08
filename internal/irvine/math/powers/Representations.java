package irvine.math.powers;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Find representations of a number in terms of positive powers.  This is only
 * useful for checking isolated values.
 * @author Sean A. Irvine
 */
final class Representations {

  private final Z[] mPowers;

  private Representations(final Z n, final int power) {
    mPowers = new Z[n.root(power).intValueExact() + 10];
    for (int k = 0; k < mPowers.length; ++k) {
      mPowers[k] = Z.valueOf(k).pow(power);
    }
  }

  private void search(final long[] t, final Z target, final int m, final int prev) {
    if (m == 0) {
      if (target.isZero()) {
        System.out.println(Arrays.toString(t));
      }
      return;
    }
    final int l = Arrays.binarySearch(mPowers, target.divide(m));
    final int lower = l < 0 ? 2 - l : l;
    final int h = Arrays.binarySearch(mPowers, target);
    for (int v = h < 0 ? 2 - h : h; v >= lower; --v) {
      if (v > prev) {
        break;
      }
      t[m - 1] = v;
      search(t, target.subtract(mPowers[v]), m - 1, v);
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
    final Representations rep = new Representations(n, power);
    rep.search(new long[terms], n, terms, Integer.MAX_VALUE);
  }
}
