package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Find minimal deviations from Fibonacci and Lucas numbers for factorials.
 *
 * @author Sean A. Irvine
 */
public final class FiboDeviation  {

  /** Prevent instantiation. */
  private FiboDeviation() { }

  /**
   * Sequentially try each value of a.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    int n = 2;
    Z fa = Z.ZERO;
    Z fb = Z.ONE;
    int fc = 1;
    Z la = Z.TWO;
    Z lb = Z.ONE;
    int lc = 1;
    Z f = Z.ONE;
    while (true) {
      f = f.multiply(n);
      final double fl = f.bitLength();

      Z z;
      while ((z = fb.add(fa)).compareTo(f) <= 0) {
        fa = fb;
        fb = z;
        ++fc;
      }

      final Z cBelow = f.subtract(fb);
      final Z cAbove = z.subtract(f);
      if (cBelow.compareTo(cAbove) <= 0) {
        final int bl = cBelow.bitLength();
        System.out.println(n + "\t-\tF\t" + fc + "\t" + bl + "\t" + bl / fl);
      } else {
        final int bl = cAbove.bitLength();
        System.out.println(n + "\t+\tF\t" + (fc + 1) + "\t" + bl + "\t" + bl / fl);
      }

      while ((z = lb.add(la)).compareTo(f) <= 0) {
        la = lb;
        lb = z;
        ++lc;
      }

      final Z clBelow = f.subtract(lb);
      final Z clAbove = z.subtract(f);
      if (clBelow.compareTo(clAbove) <= 0) {
        final int bl = clBelow.bitLength();
        System.out.println(n + "\t-\tL\t" + lc + "\t" + bl + "\t" + bl / fl);
      } else {
        final int bl = clAbove.bitLength();
        System.out.println(n + "\t+\tL\t" + (lc + 1) + "\t" + bl + "\t" + bl / fl);
      }

      ++n;
    }
  }
}

