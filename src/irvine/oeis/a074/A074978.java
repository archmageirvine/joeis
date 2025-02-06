package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074978 Prime(prime(n)) ends with n.
 * @author Sean A. Irvine
 */
public class A074978 extends Sequence1 {

  private long mN = 6446;
  private long mMod = 10000;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (Functions.PRIME.z(Functions.PRIME.z(mN)).mod(mMod) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
