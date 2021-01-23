package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029902 h(n), where strategic move on g(n) X 3 rectangle in Chomp is (h(n),2). Conjectured to be complementary to r(n), see A029905.
 * @author Sean A. Irvine
 */
public class A029902 extends A029899 {

  private int mPrev = 0;
  private int mM = -1;
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // Following heuristic is based on observation that the next term
      // of this sequence always seems to appear within 4 (actually 3)
      // of the previous term
      while (mM < mPrev + 4) {
        super.next();
        ++mM;
      }
      for (int k = mM; k >= mN; --k) {
        if (mPPositions.contains(pack(k, k, mN))) {
          mPrev = k;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
