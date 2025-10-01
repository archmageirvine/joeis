package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006882;

/**
 * A080778 Double factorial primes; values k for which k!! + 1 is prime.
 * @author Sean A. Irvine
 */
public class A080778 extends Sequence1 {

  private final Sequence mF = new A006882();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mF.next().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
