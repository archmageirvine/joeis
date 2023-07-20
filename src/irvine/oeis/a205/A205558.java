package irvine.oeis.a205;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A205558 (A204898)/2 = (prime(k)-prime(j))/2; A086802 without its zeros.
 * Copied from A204892.
 * @author Georg Fischer
 */
public class A205558 extends Sequence1 {

  private final Z mC;
  private int mK;
  private int mJ;
  private final int mDist;
  private final int mVariant;
  private final MemorySequence mSeq;

  /** Construct the sequence. */
  public A205558() {
    this(new A000040(), 2, 6);
  }

  /**
   * Generic constructor with 
   * @param seq underlying sequence (with offset 1)
   * @param c divisor
   * @param variant: 1=k(n), 2=j(n), 5=p(k(n))-p(j(n)), 6=p(k(n))-p(j(n))/c
   */
  public A205558(final Sequence seq, final int c, final int variant) {
    mC = Z.valueOf(c);
    mDist = 1;
    mVariant = variant;
    mSeq = MemorySequence.cachedSequence(seq);
    mK = 0;
    mJ = 0;
  }

  @Override
  public Z next() {
    while (true) {
      while (++mJ < mK) {
        // System.out.println("mK=" + mK + ", mJ=" + mJ);
        final Z sk = mSeq.a(mK - mDist);
        final Z sj = mSeq.a(mJ - mDist);
        final Z skmsj = sk.subtract(sj);
        final Z[] quot = skmsj.divideAndRemainder(mC);
        if (quot[1].isZero()) {
          // System.out.println("\t\tsk=" + sk + ", sj=" + sj + ", skmsj=" + skmsj + ", quot[0]=" + quot[0] + ", quot[1]=" + quot[1]);
          switch (mVariant) {
            case 2:
              return Z.valueOf(mJ);
            case 3:
              return sk;
            case 4:
              return sj;
            case 5:
              return skmsj;
            case 6:
              return quot[0];
            case 1:
            default:
              return Z.valueOf(mK);
          }
        }
      }
      ++mK;
      mJ = 0;
    }
  }
}
