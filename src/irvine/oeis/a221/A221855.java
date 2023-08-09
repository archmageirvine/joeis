package irvine.oeis.a221;

import irvine.math.z.Z;
import irvine.oeis.a220.A220018;

/**
 * A221855 Number of cyclotomic cosets of 13 mod 10^n.
 * @author Georg Fischer
 */
public class A221855 extends A220018 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? super.next() : super.next().add(1);
  }
}
