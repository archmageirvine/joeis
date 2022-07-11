package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a034.A034386;

/**
 * A057872 A version of the Chebyshev function theta(n): a(n) = round(Sum_{primes p &lt;= n } log(p)).
 * @author Sean A. Irvine
 */
public class A057872 extends A034386 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log().round();
  }
}

