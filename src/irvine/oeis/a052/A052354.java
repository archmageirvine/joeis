package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a031.A031928;

/**
 * A052354 Least prime in A031928 (lesser of 10-twins) whose distance to the next 10-twin is 6*n.
 * @author Sean A. Irvine
 */
public class A052354 extends Sequence2 {

  private long mN = 6;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A031928();
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
