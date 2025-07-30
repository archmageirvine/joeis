package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A035232 Number of substrings of n which are primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A035232 extends Sequence1 implements DirectSequence {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final String s = n.toString();
    long c = 0;
    for (Z p = Z.TWO; p.compareTo(n) <= 0; p = mPrime.nextPrime(p)) {
      final String ps = String.valueOf(p);
      for (int t = s.indexOf(ps); t >= 0; t = s.indexOf(ps, t + 1)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

