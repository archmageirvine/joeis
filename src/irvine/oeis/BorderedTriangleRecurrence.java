package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * Generate the rows of a triangle T(n,k) depending on 
 * the left and right border (column), and the terms in the previous row.
 * This generalizes the rules for Pascal's triangle (A007318):
 * T(n,0) = T(n,n) = 1 and T(n,k) = T(n-1,k-1) + T(n-1,k) for 0 &lt; k &lt; n.
 * n and k always start with 0.
 * @author Georg Fischer
 */
public class BorderedTriangleRecurrence implements Sequence {

  private final Sequence mSeqL; // sequence for the left border T(n,0)
  private final Sequence mSeqR; // sequence for the right border T(n,n); this overwrites T(0,0)
  private final Sequence mSeqA; // a(n) of this optional sequence may be used to compute T(n,k) for 0 &lt; k &lt; n.
  protected Z[] mOldRow; // previous row T(n-1,k)
  protected Z[] mNewRow; // current row T(n,k)
  private int mN; // current row index n
  private int mK; // current column index k
  protected Z mAdd; // term of mSeqA, additive constant per row

  /**
   * Empty constructor.
   * Generates an ordinary Pascal triangle.
   */
  public BorderedTriangleRecurrence() {
    this(new A000041(), new A000041());
  }

  /**
   * Triangle with sequences for the borders.
   * @param seqL sequence for the left border T(n,0)
   * @param seqR sequence for the right border T(n,n); this overwrites T(0,0)
   */
  public BorderedTriangleRecurrence(final Sequence seqL, final Sequence seqR) {
    this(seqL, seqR, null);
  }

  /**
   * Triangle with sequences for the borders and for the formulas in one row.
   * @param seqL sequence for the left border T(n,0)
   * @param seqR sequence for the right border T(n,n); this overwrites T(0,0)
   * @param seqA a(n) of this sequence may be used to compute T(n,k) for 0 &lt; k &lt; n.
   */
  public BorderedTriangleRecurrence(final Sequence seqL, final Sequence seqR, final Sequence seqA) {
    mSeqL = seqL;
    mSeqR = seqR;
    mSeqA = seqA;
    mNewRow = new Z[0];
    mN = -1;
    mK = -1; // start with first element T(0,0)
    mAdd = Z.ZERO;  // for safety
  }

  /**
   * Computes an inner element.
   * This method is typically overwritten.
   * The default implementation here is Pascal's rule.
   * @param n row number; can only be used in the formula, and not to access a row different from mOldRow.
   * @param k column number with 0 &lt; k &lt; n.
   * @return T(n,k)
   */
  protected Z compute(final int n, final int k) {
    Z result = get(k - 1).add(get(k));
    if (mSeqA != null) {
      result = result.add(mAdd);
    }
    return result;
  }
  
  /**
   * Gets an element of the previous row.
   * @param k column number
   * @return T(n-1,k)
   */
  protected Z get(final int k) {
    return mOldRow[k];
  }
  
  /**
   * Gets the additive term from mSeqA for the current row
   * @return mAdd
   */
  protected Z getA() {
    return mAdd;
  }
  
  /**
   * Advances the sequence for the leftmost column.
   * @param skip number of elements to skip
   */
  protected void skipLeft(int skip) {
    while (skip > 0) {
      mSeqL.next();
      --skip;
    }
  }
  
  /**
   * Advances the sequence for the rightmost column.
   * @param skip number of elements to skip
   */
  protected void skipRight(int skip) {
    while (skip > 0) {
      mSeqR.next();
      --skip;
    }
  }
  
  /**
   * Advances the sequence for the additive term.
   * @param skip number of elements to skip
   */
  protected void skipAdd(int skip) {
    while (skip > 0) {
      mSeqA.next();
      --skip;
    }
  }
  
  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    ++mK;
    if (mK > mN) {
      ++mN;
      mK = 0;
      mOldRow = mNewRow;
      mNewRow = new Z[mN + 1];
      if (mSeqA != null && mN >= 2) {
        mAdd = mSeqA.next();
      }
    }
    Z result = null;
    if (mK == 0) {
      result = mSeqL.next();
    } 
    if (mK == mN) {
      result = mSeqR.next();
    } 
    if (mK > 0 && mK < mN) {
      result = compute(mN, mK);
    }
    mNewRow[mK] = result;
    return result;
  }

}
