package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;

/**
 * A079305 First near twin primes of order 6n: smallest p such that p, p+2, p+6n and p+6n+2 are primes.
 * @author Sean A. Irvine
 */
public class A079305 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence twins = new A001359();
    while (true) {
      final Z p = twins.next();
      if (p.add(6 * mN).isProbablePrime() && p.add(6 * mN + 2).isProbablePrime()) {
        return p;
      }
    }
  }
}
