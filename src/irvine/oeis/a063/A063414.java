package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a039.A039716;

/**
 * A063414 Number of digits in prime(n)! (A039716).
 * @author Sean A. Irvine
 */
public class A063414 extends A039716 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
