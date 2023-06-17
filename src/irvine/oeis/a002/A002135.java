package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002135 Number of terms in a symmetrical determinant: a(n) = n*a(n-1) - (n-1)*(n-2)*a(n-3)/2.
 * @author Sean A. Irvine
 */
public class A002135 extends AbstractSequence {

  /** Construct the sequence. */
  public A002135() {
    super(0);
  }

  private Z mA = Z.NEG_ONE;
  protected Z mB = Z.ZERO;
  protected Z mC = Z.ZERO;
  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z t = mC.multiply(mN).subtract(mA.multiply(mN - 1).multiply(mN - 2).divide2());
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
