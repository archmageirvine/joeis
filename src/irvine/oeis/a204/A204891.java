package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A204891 Least k such that n divides A204890(k), the k-th difference of two primes.
 * @author Georg Fischer
 */
public class A204891 extends Sequence1 {

  private Z mNz;
  private final int mDist;
  private final MemorySequence mSeq;

  /** Construct the sequence. */
  public A204891() {
    this(new A204890(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param dist distance
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
      //System.out.println("n=" + mNz + ", k=" + k + ", a(n)=" + mSeq.a(k - mDist) + ", remainder=" + mSeq.a(k - mDist).remainder(mNz));
      if (mSeq.a(k - mDist).remainder(mNz).isZero()) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
