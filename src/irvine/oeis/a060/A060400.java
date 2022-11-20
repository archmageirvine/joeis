package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060400 In base ten, we try to get the digits 0,1,2,3,...,9,0,1,2,3,... in order only using a sequence of increasing primes and each time choosing the smallest prime that will give the desired digit.
 * @author Sean A. Irvine
 */
public class A060400 extends A000040 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 10) {
      mN = 0;
    }
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitCounts(p)[mN] > 0) {
        return p;
      }
    }
  }
}

