package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022299 Sequence A022298 divided by 2.
 * @author Sean A. Irvine
 */
public class A022299 extends AbstractSequence {

  private final A022298 mSeq1 = new A022298();

  /** Construct the sequence. */
  public A022299() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
