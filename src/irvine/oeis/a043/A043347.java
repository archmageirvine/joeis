package irvine.oeis.a043;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a033.A033308;

/**
 * A043347 To form the sequence, write the primes 2, 3, 5, 7,... as an infinite string 2357111317...; then take the first 2 digits of the string, 23, then the next 3 digits, 571, then the next 5 digits, 11317, then the next 7 digits, 1923293, then... (stepping through prime numbers of digits). Omit any leading 0's.
 * @author Sean A. Irvine
 */
public class A043347 extends A033308 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP); // number of digits to output
    final StringBuilder sb = new StringBuilder();
    Z t;
    while ((t = super.next()).isZero()) {
      // do nothing, skipping leading 0s
    }
    sb.append(t);
    for (int k = 1; k < mP; ++k) {
      sb.append(super.next());
    }
    return new Z(sb);
  }
}
