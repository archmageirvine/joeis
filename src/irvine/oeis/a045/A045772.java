package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A045772 a[ n ] such that a[ n ]^b is the best fit to n! with a[ n ]&gt;=b.
 * @author Sean A. Irvine
 */
public class A045772 extends A000142 {

  protected Z select(final Z bestR, final int bestB) {
    return bestR;
  }

  @Override
  public Z next() {
    final Z f = super.next();
    System.out.println("n!: " + f);
    Z bestDelta = f;
    Z bestR = Z.ONE;
    int bestB = 1;
    int b = 1;
    while (true) {
      final Z r = f.root(++b);
      System.out.println("r=" + r + " b=" + b);
      final Z r1 = r.add(1);
      final Z bz = Z.valueOf(b);
      if (r1.compareTo(bz) < 0) {
        break;
      }
      final Z above = r1.pow(b).subtract(f);
      System.out.println("above: " + above);
      if (above.compareTo(bestDelta) < 0) {
        bestDelta = above;
        bestB = b;
        bestR = r1;
        System.out.println("BEST: " + bestDelta + " " + bestR + "^" + bestB + "=" + bestR.pow(bestB));
      }
      if (r.compareTo(bz) < 0) {
        final Z below = f.subtract(r.pow(b));
        System.out.println("below: " + below);
        if (below.compareTo(bestDelta) < 0) {
          bestDelta = below;
          bestB = b;
          bestR = r;
        }
      }
    }
    return select(bestR, bestB);
  }
}

