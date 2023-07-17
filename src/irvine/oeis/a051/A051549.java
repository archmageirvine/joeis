package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A051549 a(n) = LCM { sigma(1), ..., sigma(n) }.
 * @author Sean A. Irvine
 */
public class A051549 extends A000203 {

  /** Construct the sequence. */
  public A051549() {
    super(0);
  }

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
