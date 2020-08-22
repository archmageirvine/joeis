package irvine.oeis.a026;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026424 Number of prime divisors (counted with multiplicity) is odd; Liouville function lambda(n) (A008836) is negative.
 * @author Sean A. Irvine
 */
public class A026424 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Cheetah.factor(++mN).bigOmega() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
