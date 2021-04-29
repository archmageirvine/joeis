package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046832 Internal digits of n^2 include digits of n.
 * @author Sean A. Irvine
 */
public class A046832 implements Sequence {

  private Z mN = Z.valueOf(49);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts1 = ZUtils.digitCounts(mN);
      final Z sq = mN.square();
      final int[] cnts2 = ZUtils.digitCounts(sq);
      --cnts2[(int) sq.mod(10)];
      --cnts2[sq.toString().charAt(0) - '0'];
      if (A046828.is(cnts2, cnts1)) {
        return mN;
      }
    }
  }
}
