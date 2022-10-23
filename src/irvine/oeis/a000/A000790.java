package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000790 Primary pretenders: least composite c such that n^c == n (mod c).
 * @author Sean A. Irvine
 */
public class A000790 extends Sequence0 {

  private long mN = -1;
  private final Fast mP = new Fast();

  @Override
  public Z next() {
    ++mN;
    long c = 3;
    while (true) {
      ++c;
      if (!mP.isPrime(c) && LongUtils.modPow(mN, c, c) == mN % c) {
        return Z.valueOf(c);
      }
    }
  }
}
