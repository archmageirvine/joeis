package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A204891 Least k such that n divides A204890(k), the k-th difference of two primes.
 * @author Georg Fischer
 */
public class A204891 implements Sequence {

  private Z mNz;
  private int mDist;
  private MemorySequence mSeq;

  /** Construct the sequence. */
  public A204891() {
    this(new A204890(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq
   * @param dist
   */
  public A204891(final Sequence seq, final int dist) {
    mNz = Z.ZERO;
    mSeq = MemorySequence.cachedSequence(seq);
    mDist = dist;
  }

  @Override
  public Z next() {
    mNz = mNz.add(1);
    int k = 1;
    while (true) {
      if (mSeq.a(k - mDist).mod(mNz).isZero()) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
