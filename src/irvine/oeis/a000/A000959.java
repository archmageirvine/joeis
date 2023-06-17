package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A000959 Lucky numbers.
 * @author David W. Wilson
 * @author Sean A. Irvine
 */
public class A000959 extends AbstractSequence {

  /** Construct the sequence. */
  public A000959() {
    super(1);
  }

  protected final LongDynamicLongArray mLucky = new LongDynamicLongArray();
  private long mN = -1;
  private long mG = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      mLucky.set(0, 1L);
    } else if (mN == 1) {
      mLucky.set(1, 3L);
    } else {
      // Compute the mNth lucky number
      // Update mG to largest index with mLucky[mG] <= mN+1
      if (mLucky.get(mG + 1) <= mN + 1) {
        ++mG;
      }

      // Now we are going to trace the position k of the mNth
      // lucky number backwards through the sieving process.
      // k is the nth lucky number, so it is at position mN
      // after all the sieves.
      long k = mN;

      // If mLucky[i] > mN+1, the sieve on mLucky[i] does not alter
      // the position of the mNth lucky number, that is, does not
      // alter k. So we need to run backwards through the sieves
      // for which mLucky[i] <= mN+1. The last such sieve is the
      // sieve for mLucky[mG], by definition of mG.

      // So, we run backwards through the sieves for mLucky[mG]
      // down to the sieve for mLucky[1] = 3.
      for (long i = mG; i > 0; --i) {
        // Here k is the position of the mNth lucky number
        // after the sieve on mLucky[i]. Adjust the position
        // prior to the sieve on mLucky[i].
        k = k * mLucky.get(i) / (mLucky.get(i) - 1);
      }

      // Here k is the position of the mNth lucky number prior to
      // sieve on 3; that is, after the sieve on 2. Adjust the
      // position prior to the sieve on 2.
      k = 2 * k;

      // Here k is the position of the mNth lucky number prior to
      // the sieve on 2, that is, within the natural numbers
      // (1, 2, 3, ...) indexed on 0. So the nth lucky number is
      mLucky.set(mN, k + 1);
    }
    return Z.valueOf(mLucky.get(mN));
  }
}
