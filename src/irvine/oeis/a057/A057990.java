package irvine.oeis.a057;
// manually posins at 2021-09-21 20:57

import irvine.math.z.Z;

/**
 * A057990 Positions of 00 in A057985.
 * @author Georg Fischer
 */
public class A057990 extends A057985 {

  protected int mN; // current index
  protected Z mPrev; // previous term of A057985
  
  /** Construct the sequence. */
  public A057990() {
    mN = 0;
    mPrev = Z.NEG_ONE;
  }
  
  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.equals(mPrev) && t.equals(Z.ZERO)) {
        mPrev = t;
        return Z.valueOf(mN - 1);
      } else {
        mPrev = t;
      }
    }
  }
}
