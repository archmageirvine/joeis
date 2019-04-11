package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010052 Characteristic function of squares: <code>a(n) = 1</code> if n is a square, otherwise 0.
 * @author Sean A. Irvine
 */
public class A010052 implements Sequence {

  private long mNext = 0;
  private long mM = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == mNext) {
      mNext = ++mM * mM;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}

