package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073426 Number of primes between n-th prime and n-th composite or number of primes that are &gt;=Min[prime(n),c(n)] and are &lt; Max[prime(n),c(n)].
 * @author Sean A. Irvine
 */
public class A073426 extends A000040 {

  private final Sequence mComposites = new A002808();

  @Override
  public Z next() {
    final Z c = mComposites.next();
    Z p = super.next();
    long cnt = 0;
    if (p.compareTo(c) < 0) {
      while (p.compareTo(c) < 0) {
        p = mPrime.nextPrime(p);
        ++cnt;
      }
    } else {
      while (p.compareTo(c) > 0) {
        p = mPrime.prevPrime(p);
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

