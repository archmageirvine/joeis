package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A052148 Integers n &lt; (reversal of n) such that (reversal of n) + 1 is divisible by n-1.
 * @author Sean A. Irvine
 */
public class A052148 extends Sequence1 {

  private Z mN = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      final Z n1 = mN;
      mN = mN.add(1);
      final Z rev = ZUtils.reverse(mN);
      if (mN.compareTo(rev) < 0 && rev.add(1).mod(n1).isZero()) {
        return mN;
      }
    }
  }
}

