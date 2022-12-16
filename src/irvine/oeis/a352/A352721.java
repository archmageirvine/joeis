package irvine.oeis.a352;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a004.A004647;

/**
 * A352721 Perfect cubes whose decimal digits appear in nonincreasing order.
 * @author Georg Fischer
 */
public class A352721 extends A004647 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : super.next().pow(3);
  }
}
