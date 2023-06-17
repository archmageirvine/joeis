package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A034865 a(n) = n!*(n-4)/2.
 * @author Sean A. Irvine
 */
public class A034865 extends AbstractSequence {

  /** Construct the sequence. */
  public A034865() {
    super(4);
  }

  private Z mF = Z.THREE;
  private long mN = 3;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 4);
  }
}
