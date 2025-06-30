package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a031.A031924;

/**
 * A052352 Least prime in A031924 (lesser of 6-twins) such that the distance to the next 6-twin is 2*n.
 * @author Sean A. Irvine
 */
public class A052352 extends Sequence3 {

  private long mN = 4;

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new A031924();
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
