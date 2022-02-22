package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055812;

/**
 * A204521 Square root of floor(A055812(n) / 5).
 * @author Georg Fischer
 */
public class A204521 implements Sequence {

  private Sequence mSeq;
  private int mBase;

  /** Construct the sequence. */
  public A204521() {
    this(new A055812(), 5);
  }

  /**
   * Generic constructor with parameters
   * @param seq
   * @param base
   */
  public A204521(final Sequence seq, final int base) {
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    return mSeq.next().divide(mBase).sqrt();
  }
}
