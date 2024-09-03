package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072120 Least k such that n! divides C(2k,k).
 * @author Sean A. Irvine
 */
public class A072120 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    long k = 0;
    while (true) {
      ++k;
      if (Binomial.binomial(2 * k, k).mod(f).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
