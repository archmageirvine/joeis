package irvine.oeis.a089;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089374 Numbers n such that the concatenation (in descending order) of all the divisors of n, with 1 in the least significant position, is prime (or 1).
 * @author Sean A. Irvine
 */
public class A089374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final StringBuilder sb = new StringBuilder();
      final Z[] divs = Jaguar.factor(mN).divisorsSorted();
      for (int k = divs.length - 1; k >= 0; --k) {
        sb.append(divs[k]);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
