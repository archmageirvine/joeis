package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061309 a(n) is the smallest number required to make the concatenation of a(n) and 2n+1 a prime, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A061309 extends Sequence0 {

  private long mN = -1;
  private long mAdd = 10;

  @Override
  public Z next() {
    mN += 2;
    if (mN > mAdd) {
      mAdd *= 10;
    }
    if (mN > 5 && mN % 5 == 0) {
      return Z.NEG_ONE;
    }
    long s = 0;
    while (true) {
      if (Z.valueOf(mN + s).isProbablePrime()) {
        return Z.valueOf(s / mAdd);
      }
      s += mAdd;
    }
  }
}
