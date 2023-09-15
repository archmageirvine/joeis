package irvine.oeis.a065;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065776 a(n+1) is the next smallest square ending with a(n), initial term is 6.
 * @author Sean A. Irvine
 */
public class A065776 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;
  protected Z mT = Z.ONE;

  protected A065776(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A065776() {
    this(Z.SIX);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else if (mA.isZero()) {
      mA = Z.valueOf(100);
    } else {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.multiply(10);
      }
      for (final Z v : QuadraticCongruence.solve(Z.ONE, Z.ZERO, mA.negate(), mT)) {
        final Z s = v.square();
        if (s.compareTo(mA) > 0) {
          mA = v.square();
          break;
        }
      }
    }
    return mA;
  }
}
