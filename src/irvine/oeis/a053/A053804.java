package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053804 Numbers where the difference of consecutive fifth powers is "close" to another fifth power: let m = k^5 - (k-1)^5; sequence lists the numbers k where m - floor(m^(1/5))^5 &lt; floor(sqrt(k))^5.
 * @author Sean A. Irvine
 */
public class A053804 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = mN.pow(5).subtract(mN.subtract(1).pow(5));
      if (a.subtract(a.root(5).pow(5)).compareTo(mN.sqrt().pow(5)) < 0) {
        return mN;
      }
    }
  }
}

