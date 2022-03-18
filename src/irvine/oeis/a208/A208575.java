package irvine.oeis.a208;
// manually 2022-02-28

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007623;

/**
 * A208575 Product of digits of n in factorial base.
 * @author Georg Fischer
 */
public class A208575 implements Sequence {

  private Sequence mSeq; // underlying sequence
  private int mBase;

  /** Construct the sequence. */
  public A208575() {
    this(new A007623(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param base number base
   */
  public A208575(final Sequence seq, final int base) {
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    return ZUtils.digitProduct(mSeq.next(), mBase);
  }
}
