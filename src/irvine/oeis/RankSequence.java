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
public class RankSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  private final Sequence mSeqF; // first underlying sequence
  private final Sequence mSeqG; // second underlying sequence
  private final int mOrder; // order: if 0 then seqF before seqG, if 1 then seqF after seqG
  private long mRank; // current rank
  private final int mFlag; // 1 yields sequence a, 2 yields sequence b
  private Z mF; // last term of mSeqF
  private Z mG; // last term of mSeqG

  /**
   * Construct an instance from two sequences f and g.
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   * @param order: if 0 then <code>seqF</code> before <code>seqG</code>, if 1 then <code>seqF</code> after <code>seqG</code>.
   * @param flag: 1 yields sequence a, 2 yields sequence b.
   */
  public RankSequence(final Sequence seqF, final Sequence seqG, final int order, final int flag) {
    this(DEFOFF, seqF, seqG, order, flag);
  }

  /**
   * Construct an instance from two sequences f and g.
   * @param offset first index
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   * @param order: if 0 then <code>seqF</code> before <code>seqG</code>, if 1 then <code>seqF</code> after <code>seqG</code>.
   * @param flag: 1 yields sequence a, 2 yields sequence b.
   */
  public RankSequence(final int offset, final Sequence seqF, final Sequence seqG, final int order, final int flag) {
    super(offset);
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
