package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072119 Least k such that k(k+1)(k+2)...(k+n) divides C(2k,k).
 * @author Sean A. Irvine
 */
public class A072119 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Binomial.binomial(2 * k, k).mod(Functions.POCHHAMMER.z(k, mN + 1)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
