package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006044 a(n) = 4^(n-4)*(n-1)*(n-2)*(n-3).
 * @author Sean A. Irvine
 */
public class A006044 extends AbstractSequence {

  /* Construct the sequence. */
  public A006044() {
    super(4);
  }

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(4);
    }
    return mA.multiply(mN).multiply(mN + 1).multiply(mN + 2);
  }
}

