package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052021 Numbers with a sum of digits equal to their greatest prime factor.
 * @author Sean A. Irvine
 */
public class A052021 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long sum = Functions.DIGIT_SUM.l(++mN);
      if (mN % sum == 0) {
        final Z[] p = Jaguar.factor(mN).toZArray();
        if (p[p.length - 1].equals(sum)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
