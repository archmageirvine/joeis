package irvine.oeis.a135;
// manually trisum/trisum2 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a023.A023531;
import irvine.oeis.a097.A097807;

/**
 * A135221 Triangle A007318 + A000012(signed) - I, I = Identity matrix, read by rows.
 * @author Georg Fischer
 */
public class A135221 extends AbstractSequence {

  private final A007318 mSeq1 = new A007318();
  private final A097807 mSeq2 = new A097807();
  private final A023531 mSeq3 = new A023531();

  /** Construct the sequence. */
  public A135221() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next()).subtract(mSeq3.next());
  }
}
