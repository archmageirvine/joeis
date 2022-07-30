package irvine.oeis.a344;

import irvine.math.z.Z;

/**
 * A344877 a(n) = gcd(n, A344875(n)), where A344875 is multiplicative with a(2^e) = 2^(1+e) - 1, and a(p^e) = p^e -1 for odd primes p.
 * @author Georg Fischer
 */
public class A344877 extends A344875 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().gcd(Z.valueOf(mN));
  }
}
