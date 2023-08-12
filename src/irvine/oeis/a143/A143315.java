package irvine.oeis.a143;
// manually trisum/trisum2 at 2023-06-08 08:30

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a126.A126988;

/**
 * A143315 Triangle read by rows: T(n, k) = 2*A126988(n, k) - signum(A126988(n, k)).
 * @author Georg Fischer
 */
public class A143315 extends AbstractSequence {

  private final A126988 mSeq1 = new A126988();

  /** Construct the sequence. */
  public A143315() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().multiply2();
    return result.isZero() ? result : result.subtract(1);
  }
}
