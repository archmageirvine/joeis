package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.a007.A007978;

/**
 * A213634 n-[n/m], where m is the least nondivisor of n (as in A007978) and [ ] = floor.
 * @author Georg Fischer
 */
public class A213634 extends A007978 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.divide(super.next()));
  }
}
