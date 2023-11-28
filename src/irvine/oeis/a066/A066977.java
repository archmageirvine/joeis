package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a011.A011757;

/**
 * A066977 a(n) = gcd(prime(n^2) + 1, prime(n) + 1).
 * @author Sean A. Irvine
 */
public class A066977 extends A011757 {

  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    return super.next().add(1).gcd(mPrimes.next().add(1));
  }
}
