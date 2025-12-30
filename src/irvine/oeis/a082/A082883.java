package irvine.oeis.a082;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075860;

/**
 * A082883 Primes p(x) satisfying the following conditions: [1]# A082882(x)=1; [2]# {p(x),p(x+1)} are not twin primes; [3]# values of A075860(j) for j composites between these two non-twin primes are identical. See also A075860, A082880-A082882.
 * @author Sean A. Irvine
 */
public class A082883 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A075860().skip(2);
  private long mP = 2;
  private long mM = 2;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      final HashSet<Z> seen = new HashSet<>();
      while (mM < mP) {
        ++mM;
        final Z t = mA.next();
        if (!mPrime.isPrime(mM)) {
          seen.add(t);
        }
      }
      if (mP - q > 2 && seen.size() == 1) {
        return Z.valueOf(q);
      }
    }
  }
}
