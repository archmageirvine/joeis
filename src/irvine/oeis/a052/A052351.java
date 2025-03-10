package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023200;

/**
 * A052351 Least prime in A023200 (lesser of 4-twins) such that the distance to the next 4-twin is 6*n.
 * @author Sean A. Irvine
 */
public class A052351 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A023200();
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
