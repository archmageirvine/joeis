package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031938;

/**
 * A052359 Least prime in A031938 (lesser of primes differing by 20) whose distance to the next 20-twin is 6*n.
 * @author Sean A. Irvine
 */
public class A052359 extends AbstractSequence {

  private long mN = 18;

  /** Construct the sequence. */
  public A052359() {
    super(4);
  }

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A031938();
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
