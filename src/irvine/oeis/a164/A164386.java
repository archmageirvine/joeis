package irvine.oeis.a164;
// manually compseq at 2021-09-17

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A164386 Numbers which are not 1 larger than a nonzero square.
 * Almost a complement of A002522: 1, 3, 4, 6, 7, 8, 9, 11 
 * @author Georg Fischer
 */
public class A164386 extends Sequence1 {
    
  protected int mK; // number with this property
  protected int mRoot; // root of next square
  protected int mSquare1; // next square + 1

  /** Construct the sequence. */
  public A164386() {
    mK = 0; // start with 1
    mRoot = 1;
    mSquare1 = mRoot * mRoot + 1;
  }
  
  @Override
  public Z next() {
    ++mK;
    if (mK == mSquare1) {
      mK = mSquare1 + 1;
      ++mRoot;
      mSquare1 = mRoot * mRoot + 1;
    }
    return Z.valueOf(mK);
  }
}
