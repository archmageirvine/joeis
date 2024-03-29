package irvine.oeis.a271;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A271769 Number of set partitions of [n] with minimal block length multiplicity equal to nine.
 * @author Georg Fischer
 */
public class A271769 extends AbstractSequence {

  private final A271424 mSeq = new A271424();

  /** Construct the sequence. */
  public A271769() {
    super(9);
  }

  private int mN = 8;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 9);
  }
}

