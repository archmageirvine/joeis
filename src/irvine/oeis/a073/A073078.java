package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073078 Least k such that n divides C(2k,k).
 * @author Sean A. Irvine
 */
public class A073078 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Binomial.binomial(2 * ++k, k).mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
