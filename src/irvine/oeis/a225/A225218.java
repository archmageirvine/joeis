package irvine.oeis.a225;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a054.A054038;

/**
 * A225218 Square numbers containing all the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9.
 * @author Georg Fischer
 */
public class A225218 extends A054038 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
