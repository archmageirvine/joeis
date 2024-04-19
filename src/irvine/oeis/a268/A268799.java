package irvine.oeis.a268;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A268799 Record (maximal) gaps between primes of the form 4k + 3.
 * @author Georg Fischer
 */
public class A268799 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private Z mS;
  private Z mP;
  private final long mMod;
  private final long mRes;
  private Z mRecordGap;
  private final int mVariant;

  /** Construct the sequence. */
  public A268799() {
    this(1, 3, 7, 4, 3, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param s starting prime
   * @param p prime behind s
   * @param mod modulus
   * @param res residue
   * ec@param variant: 1 = record gap, 2 = prime preceeding the gap, 3 = prime at the end of the gap
   */
  public A268799(final int offset, final int s, final int p, final int mod, final int res, final int variant) {
    super(offset);
    mS = Z.valueOf(s);
    mP = Z.valueOf(p - 1);
    mMod = mod;
    mRes = res;
    mRecordGap = Z.ZERO;
    mVariant = variant;
  }

  @Override
  public Z next() {
    // re=0; s= 3; forprime(p= 7, 1e8, if(p% 4!=3, next); g=p-s; if(g>re, re=g; print1(g", ")); s=p)  
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(mMod) == mRes) {
        final Z gap = mP.subtract(mS);
        if (gap.compareTo(mRecordGap) > 0) {
          final Z result = (mVariant == 1) ? gap : ((mVariant == 2) ? mS : mP);
          mS = mP;
          mRecordGap = gap;
          return result;
        }
        mS = mP;
      }
    }
  }
}
