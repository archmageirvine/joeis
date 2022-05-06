package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.a007.A007978;

/**
 * A213635 m*[n/m], where m is the least nondivisor of n (as in A007978) and [ ] = floor.
 * @author Georg Fischer
 */
public class A213635 extends A007978 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z m = super.next();
    return m.multiply(mN.divide(m));
  }
}
