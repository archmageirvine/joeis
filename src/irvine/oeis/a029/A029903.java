package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029903 p(n), where exists one-parameter family of strategic partitions (k+p(n)+q(n), k+q(n), r(n)) for k = 0,1,2,... in Chomp.
 * @author Sean A. Irvine
 */
public class A029903 extends A029899 {

  private static final int MIN_COUNT_TO_FIX = 5;
  private static final int LOOK_AHEAD = 50;
  private int mPrevQ0 = 0;
  private int mM = -1;
  private int mN = -1;

  protected int select(final int c, final int q0, final int r) {
    //System.out.println("r=" + r + " c=" + c + " q0=" + q0);
    return c;
  }

  @Override
  public Z next() {
    while (true) {
      // Keep a good number of iterations ahead
      while (mM < mPrevQ0 + LOOK_AHEAD) {
        super.next();
        ++mM;
      }

      ++mN;
      // We are looking for P-positions (p,q,mN) with p = q + c for all q > q0
      // We have already computed everything up to (mM, mM, mM)
      // Work backwards from mM
      int c = -1;
      int cnt = 0;
      int q;
      outer:
      for (q = mM; q >= mN; --q) {
        for (int p = mM; p >= q; --p) {
          if (mPPositions.contains(pack(p, q, mN))) {
            if (c == -1) {
              c = p - q; // Candidate c
              ++cnt;
            } else if (p - q == c) {
              ++cnt;
            } else {
              break outer;
            }
          }
        }
      }
      if (cnt >= MIN_COUNT_TO_FIX) {
        mPrevQ0 = q;
        return Z.valueOf(select(c, q + 1, mN));
      }
    }
  }
}
