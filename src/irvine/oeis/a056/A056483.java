package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056483 Number of primitive (aperiodic) palindromic structures using exactly four different symbols.
 * @author Georg Fischer
 */
public class A056483 extends AbstractSequence {

  private final A056477 mSeq1 = new A056477();
  private final A056478 mSeq2 = new A056478();

  /** Construct the sequence. */
  public A056483() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq2.next().subtract(mSeq1.next());
  }
}
