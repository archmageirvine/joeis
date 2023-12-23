package irvine.oeis.a067;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067581 a(n) = smallest integer not yet in the sequence with no digits in common with a(n-1), a(0)=0.
 * @author Sean A. Irvine
 */
public class A067581 extends Sequence0 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final int syn = ZUtils.syn(mA);
      long k = 0;
      while (true) {
        if ((LongUtils.syndrome(++k) & syn) == 0 && mSeen.add(k)) {
          mA = Z.valueOf(k);
          break;
        }
      }
    }
    return mA;
  }
}
