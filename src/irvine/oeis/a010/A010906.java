package irvine.oeis.a010;

import java.util.LinkedList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010906 Inverse Aronson transform of squares.
 * @author Sean A. Irvine
 */
public class A010906 extends Sequence0 {

  private LinkedList<Z> mList = new LinkedList<>();
  private long mN = -1;

  @Override
  public Z next() {
    if (!mList.isEmpty()) {
      return mList.pollFirst();
    }
    if (++mN == 2) {
      return Z.THREE;
    }
    final long s = LongUtils.sqrt(mN);
    if (s * s == mN) {
      return Z.valueOf(mN).square();
    }
    final Z res = Z.valueOf(mN - 1).square().add(1);
    final Z sq = Z.valueOf(mN).square();
    for (Z k = res.add(1); k.compareTo(sq) < 0; k = k.add(1)) {
      mList.add(k);
    }
    return res;
  }
}
