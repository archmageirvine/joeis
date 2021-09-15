package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A051452 a(n) = 1 + lcm(1..k) where k is the n-th prime power A000961(n).
 * @author Sean A. Irvine
 */
public class A051452 extends A000961 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm.add(1);
  }
}
