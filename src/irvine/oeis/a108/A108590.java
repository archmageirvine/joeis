package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a140.A140758;
import irvine.oeis.memory.MemorySequence;

/**
 * A108590 Self-inverse integer permutation induced by Beatty sequences for Pi/2 and Pi/(Pi-2).
 * @author Georg Fischer
 */
public class A108590 extends Sequence1 {

  private int mN;
  private int mI1; // index in mSeqLo
  private int mI2; // index in mSeqHi
  private MemorySequence mSeq1;
  private MemorySequence mSeq2;

  /** Construct the sequence. */
  public A108590() {
    this(1, 1, new A108589(), 0, new A140758());
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term of resulting sequence (0 or 1)
   * @param off1 offset of first sequence
   * @param seq1 first sequence
   * @param off2 offset of second sequence
   * @param seq2 second sequence
   */
  public A108590(final int offset, final int off1, final Sequence seq1, final int off2, final Sequence seq2) {
    mSeq1 = MemorySequence.cachedSequence(off1 == 0 ? seq1 : new PrependSequence(seq1, 0));
    mSeq2 = MemorySequence.cachedSequence(off2 == 0 ? seq2 : new PrependSequence(seq2, 0));
    mN = offset;
    mI1 = offset;
    mI2 = offset;
  }

  @Override
  public Z next() {
    while (true) {
      if (mN == mSeq1.a(mI1).intValue()) {
        ++mN;
        return mSeq2.a(mI1++);
      }
      if (mN == mSeq2.a(mI2).intValue()) {
        ++mN;
        return mSeq1.a(mI2++);
      }
      ++mN;
    }
  }
}
