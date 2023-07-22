package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056484 Number of primitive (aperiodic) palindromic structures using exactly five different symbols.
 * @author Georg Fischer
 */
public class A056484 extends AbstractSequence {

  private final A056478 mSeq1 = new A056478();
  private final A056479 mSeq2 = new A056479();

  /** Construct the sequence. */
  public A056484() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq2.next().subtract(mSeq1.next());
  }
}

