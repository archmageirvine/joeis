package irvine.oeis;

import irvine.math.z.Z;

/**
 * This class transforms the terms of an underlying sequence <code>a(n)</code>
 * into a sequence <code>b(k)</code> of zeroes and ones (or small integers),
 * where usually 1 indicates that the index of this sequence is a member of the underlying sequence,
 * and 0 that it is not a member..
 * The default implementation returns <code>b(k) = 1</code> if <code>k in a(n)</code>
 * and zero otherwise. 
 * The underlying sequence <code>a(n)</code> should be monotone, with the exception
 * of the first few elements as controlled by the parameter <code>cacheNo</code>.
 * Subclasses may return other small values (different from 0 and 1).
 * @author Georg Fischer
 */
public class CharacteristicFunction implements Sequence {

  protected final Sequence mSeq; // underlying Sequence
  protected final int mOffset; // first index of this CharacteristicFunction
  protected final int mCacheNo; // number of leading terms of {@link #mSeq} to be cached 
  protected final boolean mMemberIs1; // whether (non-) membership is indicated with 1 (0).
  protected final int[] mCache; // stores the numbers for the first {@link #mCacheNo} terms of {@link #mSeq}.
  protected int mCacheMax; // == mCache.length
  protected int mIN; // index of current term in this sequence
  protected int mSN; // index of current term in the underlying sequence
  protected int mNextTerm; // of the underlying sequence
  protected int mPrevTerm; // the term before mNextTerm
  protected static int sDebug = 0; // the term before mNextTerm

  /**
   * Create a new characteristic function from the numbers returned by a {@link Sequence}.
   * @param offset number of leading numbers not to be returned by {@link #next}
   * @param seq sequence to be transformed in a characteristic function
   * @param memberIs1 whether (non-) membership is indicated with 1 (0).
   * @param cacheNo number of leading terms of <code>seq</code> to be cached
   */
  public CharacteristicFunction(final int offset, final Sequence seq, final boolean memberIs1, final int cacheNo) {
    mSeq = seq;
    mOffset = offset;
    mCacheNo = cacheNo;
    mMemberIs1 = memberIs1;
    mIN = mOffset - 1;
    mSN = mCacheNo;
    final int[] caNums = new int[cacheNo]; // stores the leading terms
    mCacheMax = 0;
    for (int ican = 0; ican < cacheNo; ++ican) { // determine the maximum term to be cached
      mPrevTerm = mSeq.next().intValue();
      final int term = mPrevTerm; // consume cacheNo terms
      if (term < 0) {
        throw new RuntimeException("cannot indicate negative terms");
      }
    /*
      if (sDebug >= 1) {
        System.out.println(term + " cached");
      }
    */
      caNums[ican] = term;
      if (term > mCacheMax) {
        mCacheMax = term;
      }
    }
    ++mCacheMax; // make it zero-based
  /*
    if (sDebug >= 1) {
      System.out.println("mCacheMax=" + mCacheMax);
    }
  */
    mNextTerm = mSeq.next().intValue(); // not in cache; mPrevTerm is last in cache (set above)
    mCache = new int[mCacheMax]; // stores the indicators of the leading terms
    for (int icam = 0; icam < mCacheMax; ++icam) { // prefill with ZERO
      mCache[icam] = indicate(icam, 0);
    }
    for (int ican = 0; ican < cacheNo; ++ican) { // set specific terms in cache
      final int icam = caNums[ican];
      mCache[icam] = indicate(icam, 1);
    }
  }

  /**
   * Create a new characteristic function from the numbers returned by a {@link Sequence}.
   * @param offset number of leading numbers not to be returned by {@link #next}
   * @param seq sequence to be transformed in a characteristic function
   * @param memberIs1 whether (non-) membership is indicated with 1 (0).
   */
  public CharacteristicFunction(final int offset, final Sequence seq, final boolean memberIs1) {
   this(offset, seq, memberIs1, 4);
  }
  
  /**
   * Create a new characteristic function from the numbers returned by a {@link Sequence}.
   * @param offset number of leading numbers not to be returned by {@link #next}
   * @param seq sequence to be transformed in a characteristic function
   */
  public CharacteristicFunction(final int offset, final Sequence seq) {
   this(offset, seq, true, 4);
  }
  
  /**
   * Create a new CharacteristicFunction from the numbers returned by a {@link Sequence}.
   * @param seq sequence to be transformed in a characteristic function
   */
  public CharacteristicFunction(final Sequence seq) {
   this(1, seq, true, 4);
  }
  
  @Override
  public Z next() {
    ++mIN;
    if (mIN < mCacheMax) {
      return Z.valueOf(mCache[mIN]);
    } 
    if (mIN < mNextTerm) {
      return Z.valueOf(indicate(mIN, 0)); // still not next member
    } else if (mIN == mNextTerm) {
      mNextTerm = mSeq.next().intValue();
      ++mSN;
      return Z.valueOf(indicate(mIN, 1)); // next member is hit
    } else {
      throw new RuntimeException("sequence is decreasing at index " + mSN);
    }
  }

  /**
   * Maps the state of the term if the underlying sequence
   * to a value of this characteristic function.
   * This method may be overwritten. 
   * For example, a negation can be accomplished by
   * <code>return super.indicate(num, 1 - state)</code>
   * @param num term of the underlying sequence to be indicated
   * @param state usually 1 for "is a member" and 0 for "is not a member" 
   * (of the underlying sequence).
   * @return value for <code>this</code> characteristic function, default 1
   */
  protected int indicate(final int num, final int state) {
    return ((mMemberIs1 ? state : 1 - state) == 1) ? 1 : 0;
  }

  /**
   * Generate the indicator sequence of the Lucas numbers
   * @param args commandline arguments
   */
  public static void main(final String[] args) {
    sDebug = 1;
    final Sequence indSeq = new CharacteristicFunction(1, new irvine.oeis.a000.A000032(), true, 4);
    final int termNo = 64;
    for (int iterm = 0; iterm < termNo; ++iterm) {
      System.out.println(iterm + " " + indSeq.next().toString());
    } 
  }
}
