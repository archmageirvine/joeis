package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013989 a(n) = (n+1)*(a(n-1)/n + a(n-2)), with a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A013989 extends AbstractSequence {

  /** Construct the sequence. */
  public A013989() {
    super(0);
  }

  protected long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    final Z r = mA.add(mB.divide(mN)).multiply(mN + 1);
    mA = mB;
    mB = r;
    return r;
  }
}

