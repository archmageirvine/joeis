package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000790 Primary pretenders: least composite c such that <code>n^c == n (mod c)</code>.
 * @author Sean A. Irvine
 */
public class A000790 implements Sequence {

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
