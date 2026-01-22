package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006472;

/**
 * A392560 a(n) = nextprime(P(n)+1) - P(n), where P(n) is the product of the first n triangular numbers and nextprime(i) is the smallest prime &gt; i.
 * @author Sean A. Irvine
 */
public class A392560 extends A006472 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z prod = super.next();
    return Functions.NEXT_PRIME.z(prod.add(1)).subtract(prod);
  }
}
