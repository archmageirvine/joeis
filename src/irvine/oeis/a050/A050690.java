package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050690 Sum of digits of zero-absent composite a(n) equals number of prime factors.
 * @author Sean A. Irvine
 */
public class A050690 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == Functions.DIGIT_SUM.l(mN) && !String.valueOf(mN).contains("0")) {
        return Z.valueOf(mN);
      }
    }
  }
}
