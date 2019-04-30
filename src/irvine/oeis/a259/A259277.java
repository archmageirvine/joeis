package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.nt.homeprime.ReverseHomePrime;
import irvine.oeis.a000.A000040;

/**
 * A259277 Least m such that HomePrime(m) <code>= prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A259277 extends A000040 {

  @Override
  public Z next() {
    return ReverseHomePrime.homePrimeTree(super.next(), 10).get(0);
  }
}
