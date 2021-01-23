package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003151;

/**
 * A022804 a(n) = B(n) + c(n) where B(n) is Beatty sequence [ n*sqrt(2) ] and c is the complement of B.
 * @author Sean A. Irvine
 */
public class A022804 extends A003151 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
