package irvine.oeis.a260;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054440;

/**
 * A260669 Number of unordered pairs of partitions of n with no common parts.
 * @author Georg Fischer
 */
public class A260669 extends AbstractSequence {

  private final A054440 mSeq1 = new A054440();

  /** Construct the sequence. */
  public A260669() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
