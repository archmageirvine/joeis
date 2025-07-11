package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031930;

/**
 * A052355 Least prime in A031930 (lesser of 12-twins) whose distance to the next 12-twin is 2*n.
 * @author Sean A. Irvine
 */
public class A052355 extends AbstractSequence {

  private long mN = 10;

  /** Construct the sequence. */
  public A052355() {
    super(6);
  }

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new A031930();
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
