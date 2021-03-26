package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A342847.
 * @author Sean A. Irvine
 */
public class A342847 extends A000142 {

  private int mMinExponent = 1;

  protected Z select(final Z bestBase, final int bestE, final Z bestDelta) {
    //System.out.println(bestBase + "^" + bestE + " + " + bestDelta);
    return bestBase;
  }

  @Override
  public Z next() {
    final Z f = super.next();
    Z bestBase = Z.ONE;
    int bestExponent = 1;
    Z bestDeltaAbs = f;
    Z bestDelta = Z.ZERO;
    if (!Z.ONE.equals(f)) {
      int e = mMinExponent - 1;
      while (true) {
        final Z base = f.root(++e);
        final Z ez = Z.valueOf(e);
        if (base.compareTo(ez) > 0) {
          mMinExponent = e;
          continue;
        }
        if (base.isZero()) {
          break;
        }
        final Z b1 = base.add(1);
        if (b1.compareTo(ez) <= 0) {
          final Z above = b1.pow(e).subtract(f);
          if (above.compareTo(bestDeltaAbs) < 0) {
            bestDeltaAbs = above;
            bestDelta = above.negate();
            bestExponent = e;
            bestBase = b1;
          }
        }
        final Z below = f.subtract(base.pow(e));
        if (below.compareTo(bestDeltaAbs) < 0) {
          bestDeltaAbs = below;
          bestDelta = below;
          bestExponent = e;
          bestBase = base;
        }
        if (Z.ONE.compareTo(base) >= 0) {
          break;
        }
      }
    }
    return select(bestBase, bestExponent, bestDelta);
  }
}

