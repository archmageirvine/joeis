package irvine.oeis.a240;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014664;

/**
 * A240657 Least k such that 2^k == -1 (mod prime(n)), or 0 if no such k exists.
 * @author Georg Fischer
 */
public class A240657 extends Sequence1 {

  private int mN;
  private final Sequence mSeq;
  private final int mOrder;

  /** Construct the sequence. */
  public A240657() {
    this(new PrependSequence(new A014664(), 0), 2);
  }

  /**
   * Generic constructor with parameters
   * @param seq sequence giving the order
   * @param order order of mod n-th prime
   */
  public A240657(final Sequence seq, final int order) {
    mN = 0;
    mSeq = seq;
    mOrder = order;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1 && (mOrder & 1) == 1) {
      mSeq.next();
      return Z.ONE;
    }
    final Z t = mSeq.next();
    return t.testBit(0) ? Z.ZERO : t.divide2();
  }
}
