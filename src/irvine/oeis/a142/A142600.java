package irvine.oeis.a142;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061037;

/**
 * A142600 Third trisection of A061037.
 * @author Georg Fischer
 */
public class A142600 extends Sequence1 {

  private final A061037 mSeq = new A061037();

  /** Construct the sequence. */
  public A142600() {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    mSeq.next();
    return result;
  }
}
