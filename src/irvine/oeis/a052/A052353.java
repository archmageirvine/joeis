package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031926;

/**
 * A052353 First primes of A031926 (lesser of 8-twins) with increasing distance to the next 8-twin.
 * @author Sean A. Irvine
 */
public class A052353 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A031926();
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
