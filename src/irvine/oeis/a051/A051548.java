package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A051548 a(n) = LCM { tau(1), ..., tau(n) }.
 * @author Sean A. Irvine
 */
public class A051548 extends A000005 {

  /** Construct the sequence. */
  public A051548() {
    super(0);
  }

  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(super.next());
    return mLcm;
  }
}
