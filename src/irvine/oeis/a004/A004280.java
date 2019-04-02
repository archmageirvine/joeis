package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004280 2 together with the odd numbers (essentially the result of the first stage of the sieve of Eratosthenes).
 * @author Sean A. Irvine
 */
public class A004280 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 3 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
