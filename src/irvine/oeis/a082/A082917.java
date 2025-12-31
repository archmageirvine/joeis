package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a002.A002375;

/**
 * A082917 Numbers that can be expressed as the sum of two odd primes in more ways than any smaller even number.
 * @author Sean A. Irvine
 */
public class A082917 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A082917() {
    super(1, new A002375().skip(2), 3);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
