package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029900 f(n) where strategic move on f(n) X 3 rectangle in Chomp is (n,1).
 * @author Sean A. Irvine
 */
public class A029900 extends A029899 {

  private int mPrev = 0;
  private int mM = -1;
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // Following heuristic is based on observation that the next term
      // of this sequence always seems to appear within 5 (actually 4)
      // of the previous term
      while (mM < mPrev + 5) {
        super.next();
        ++mM;
      }
      for (int k = mM; k >= mN; --k) {
        if (mPPositions.contains(pack(k, mN, mN))) {
          mPrev = k;
          return Z.valueOf(k);
        }
      }
    }
  }
}
