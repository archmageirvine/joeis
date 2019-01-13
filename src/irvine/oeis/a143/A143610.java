package irvine.oeis.a143;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A143610.
 * @author Sean A. Irvine
 */
public class A143610 implements Sequence {

  // Squbes
  private final TreeSet<Z> mPriority = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private final int mMaxBitLength;

  private Z mP = Z.THREE;
  private Z mNext = mP.square().shiftLeft(3);

  /**
   * Only generate terms up to specified bit length.
   * @param maxBitLength maximum length of terms in bits
   */
  public A143610(final int maxBitLength) {
    mMaxBitLength = maxBitLength;
  }

  /** Construct the sequence. */
  public A143610() {
    this(Integer.MAX_VALUE);
  }

  /**
   * Size of queue.
   *
   * @return size of queued entries
   */
  public int size() {
    return mPriority.size();
  }

  @Override
  public Z next() {
    while (mPriority.isEmpty() || mPriority.first().compareTo(mNext) > 0) {
      Z mQ = Z.ONE;
      final Z pp = mP.square();
      final Z ppp = pp.multiply(mP);
      while ((mQ = mPrime.nextPrime(mQ)).compareTo(mP) < 0) {
        final Z qq = mQ.square();
        final Z a = ppp.multiply(qq);
        if (a.bitLength() > mMaxBitLength) {
          break;
        }
        mPriority.add(a);
        final Z b = pp.multiply(qq).multiply(mQ);
        if (b.bitLength() <= mMaxBitLength) {
          mPriority.add(b);
        }
      }
      mP = mPrime.nextPrime(mP);
      mNext = mP.square().shiftLeft(3);
    }
    return mPriority.pollFirst();
  }
}
