package irvine.oeis.a057;
// manually posins at 2021-09-21 20:57

import irvine.math.z.Z;

/**
 * A057989 Positions of 00 or 11 or 22 in A057985.
 * @author Georg Fischer
 */
public class A057989 extends A057985 {

  protected int mN; // current index
  protected Z mPrev; // previous term of A057985
  
  /** Construct the sequence. */
  public A057989() {
    mN = 0;
    mPrev = Z.NEG_ONE;
  }
  
  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.equals(mPrev)) {
        mPrev = t;
        return Z.valueOf(mN - 1);
      } else {
        mPrev = t;
      }
    }
  }
}
