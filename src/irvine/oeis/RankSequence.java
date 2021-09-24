package irvine.oeis;

import irvine.math.z.Z;

/**
 * Jointly ranked sequences, for example A186145/A186146:
 * <pre>
 * Write the squares (f) and cubes (g) thus:
 * 1..4....9..16..25....36..49..64..81
 * 1.....8...........27.........64.....
 * Replace each by its rank, where ties are settled by ranking the square before the cube:
 * a=(1,3,5,6,7,9,10,11,13,...)
 * b=(2,4,8,12,...) 
 * </pre>
 * @author Georg Fischer
 */
public class RankSequence implements Sequence {

  protected Sequence mSeqF; // first underlying sequence
  protected Sequence mSeqG; // second underlying sequence
  protected int mOrder; // order: if 0 then seqF before seqG, if 1 then seqF after seqG
  protected long mRank; // current rank
  protected int mFlag; // 1 yields sequence a, 2 yields sequence b
  protected Z mF; // last term of mSeqF
  protected Z mG; // last term of mSeqG
  /**
   * Empty constructor, set parameters later.
   */
  public RankSequence() {
    mOrder = 0;
    mFlag = 0;
    mRank = 0;
  }

  /**
   * Construct an instance from two sequences f and g.
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   * @param order: if 0 then seqF before seqG, if 1 then seqF after seqG.
   * @param flag: 1 yields sequence a, 2 yields sequence b.
   */
  public RankSequence(final Sequence seqF, final Sequence seqG, final int order, final int flag) {
    mSeqF = seqF;
    mSeqG = seqG;
    mOrder = order;
    mFlag = flag;
    mRank = 1;
    mF = mSeqF.next();
    while (mF.equals(Z.ZERO)) { // CK always starts with offset 1
      mF = mSeqF.next();
    }
    mG = mSeqG.next();
    while (mG.equals(Z.ZERO)) {
      mG = mSeqG.next();
    }
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    // System.out.println("mRank=" + mRank + ", mF=" + mF + ", mG=" + mG);
    int busy = 0;
    Z result = null;
    while (busy == 0) {
      result = Z.valueOf(mRank);
      if (mOrder == 0 && mF.compareTo(mG) <= 0 || mOrder == 1 && mF.compareTo(mG) < 0) {
        ++mRank;
        mF = mSeqF.next();
        if (mFlag == 1) {
          busy = mFlag;
        }
      } else { // mG is less
        ++mRank;
        mG = mSeqG.next();
        if (mFlag == 2) {
          busy = mFlag;
        }
      }
    }
    return result;
  }
}
