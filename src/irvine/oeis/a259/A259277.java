package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.factor.project.homeprime.ReverseHomePrime;
import irvine.oeis.a000.A000040;

/**
 * A259277 Least m such that HomePrime(m) = prime(n).
 * @author Sean A. Irvine
 */
public class A259277 extends A000040 {

  @Override
  public Z next() {
    return ReverseHomePrime.homePrimeTree(super.next(), 10).get(0);
  }
}
