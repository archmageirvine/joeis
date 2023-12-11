package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.memory.MemorySequence;

/**
 * A204892 Least k such that n divides s(k)-s(j) for some j in [1,k), where s(k)=prime(k).
 * @author Georg Fischer
 */
public class A204892 extends Sequence1 {

  private Z mNz;
  private int mDist;
  private int mVariant;
  private MemorySequence mSeq;

  /** Construct the sequence. */
  public A204892() {
    this(new A000040(), 1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param dist number of zeros to be prepended to the underlying sequence
   * @param variant: 1=k(n), 2=j(n), 3=s(k(n)), 4=s(j(n)), 5=s(k(n))-s(j(n)), 6=s(k(n))-s(j(n))/n
   */
  public A204892(final Sequence seq, final int dist, final int variant) {
    mNz = Z.ZERO;
    mSeq = MemorySequence.cachedSequence(seq);
    mDist = dist;
    mVariant = variant;
  }

  @Override
  public Z next() {
    mNz = mNz.add(1);
    int k = 1;
    while (true) {
      final Z sk = mSeq.a(k - mDist);
      int j = 1;
      while (j < k) {
        final Z sj = mSeq.a(j - mDist);
        final Z skmsj = sk.subtract(sj);
        final Z[] quot = skmsj.divideAndRemainder(mNz);
        if (quot[1].isZero()) {
          switch (mVariant) {
            case 2:
              return Z.valueOf(j);
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
              return Z.valueOf(k);
          }
        }
        ++j;
      }
      ++k;
    }
  }
}
