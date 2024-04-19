package irvine.oeis.a202;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a046.A046787;

/**
 * A202192 Number of partitions of 5n with equal number of parts congruent to each of 1, 2, 3 and 4 modulo 5.
 * @author Georg Fischer
 */
public class A202192 extends AbstractSequence {

  private final A046787 mSeq1 = new A046787();
  private final A000041 mSeq2 = new A000041();

  /** Construct the sequence. */
  public A202192() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
