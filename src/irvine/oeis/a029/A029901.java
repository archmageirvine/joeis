package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029901 <code>g(n)</code>, where strategic move on <code>g(n) X 3</code> rectangle in Chomp is <code>(h(n),2)</code>.
 * @author Sean A. Irvine
 */
public class A029901 extends A029899 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      super.next(); // update P-positions
      for (int k = mN; k >= 0; --k) {
        if (mPPositions.contains(pack(mN, mN, k))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
