package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076693 Numbers n such that the average of prime(n) and prime(n+1) is a perfect cube.
 * @author Sean A. Irvine
 */
public class A076693 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.CUBE.is(p.add(mPrime.nextPrime(p)).divide2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
