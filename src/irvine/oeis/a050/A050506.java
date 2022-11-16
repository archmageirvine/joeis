package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050506 Nearest integer to log(Fibonacci(n)).
 * @author Sean A. Irvine
 */
public class A050506 extends A000045 {

  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log().round();
  }
}
