package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060445 "Dropping time" in 3x+1 problem starting at 2n+1 (number of steps to reach a lower number than starting value). Also called glide(2n+1).
 * @author Sean A. Irvine
 */
public class A060445 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  static long droppingTime(final Z n) {
    if (Z.ONE.equals(n)) {
      return 0;
    }
    Z m = n;
    long cnt = 0;
    while (m.compareTo(n) >= 0) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    mN = mN.add(2);
    return Z.valueOf(droppingTime(mN));
  }
}
