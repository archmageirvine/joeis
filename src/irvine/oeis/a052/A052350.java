package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;

/**
 * A052350 Least prime in A001359 (lesser of twin primes) such that the distance (A053319) to the next twin is 6*n.
 * @author Sean A. Irvine
 */
public class A052350 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A001359();
    Z p = seq.next();
    while (true) {
      final Z q = p;
      p = seq.next();
      if (p.subtract(q).longValueExact() == mN) {
        return q;
      }
    }
  }
}
