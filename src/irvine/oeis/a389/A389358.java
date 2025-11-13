package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389358 a(n) is the least k such that k + n * A001414(k) is prime.
 * @author Sean A. Irvine
 */
public class A389358 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SOPFR.z(++k).multiply(mN).add(k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
