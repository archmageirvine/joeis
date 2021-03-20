package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045753 Numbers n such that 4n-1 and 4n+1 are both primes.
 * @author Sean A. Irvine
 */
public class A045753 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.valueOf(4 * ++mN - 1).isProbablePrime() || !Z.valueOf(4 * mN + 1).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
