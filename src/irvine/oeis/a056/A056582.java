package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000312;
import irvine.oeis.a002.A002109;

/**
 * A056582 Highest common factor (or GCD) of n^n and hyperfactorial(n-1), i.e., gcd(n^n, product(k^k) for k &lt; n).
 * @author Sean A. Irvine
 */
public class A056582 extends A000312 {

  private final Sequence mA = new A002109();
  {
    super.next();
    super.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().gcd(mA.next());
  }
}
