package irvine.oeis.a344;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061020;
import irvine.oeis.a206.A206369;

/**
 * A344441 a(n) = A061020(n) + abs(A061020(n)).
 * @author Georg Fischer
 */
public class A344441 extends AbstractSequence {

  private final A061020 mSeq1 = new A061020();
  private final A206369 mSeq2 = new A206369();

  /** Construct the sequence. */
  public A344441() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
