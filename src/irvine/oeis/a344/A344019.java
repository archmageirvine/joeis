package irvine.oeis.a344;
// manually egfsi at 2021-12-02 11:16

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344019 A tight upper bound on the order of a finite subgroup of the collineation group of the free projective plane F_n.
 * Equals 2*(n-2)! for n = 5 and n &gt;= 7; offset 4: 24, 5:12, 6:120, 7:240, 8:1440, 9:10080.
 * @author Georg Fischer
 */
public class A344019 implements Sequence {

  private int mN = 3;
  private Z mF = Z.valueOf(48);

  @Override
  public Z next() {
    ++mN;
    if (mN == 4) {
      return Z.valueOf(24);
    } else if (mN == 5) {
      return Z.valueOf(12);
    } else if (mN == 6) {
      return Z.valueOf(120);
    }
    mF = mF.multiply(mN - 2);
    return mF;
  }
}
