package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067440 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z t = n.isPower();
    mSum = mSum.add(t == null ? n : t);
    return mSum;
  }
}
