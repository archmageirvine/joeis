package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.a007.A007978;

/**
 * A213636 Remainder when n is divided by its least nondivisor.
 * @author Georg Fischer
 */
public class A213636 extends A007978 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.mod(super.next());
  }
}
