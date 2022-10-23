package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034090 Numbers whose sum of proper divisors exceeds that of all smaller numbers.
 * @author Sean A. Irvine
 */
public class A034090 extends Sequence1 {

  private Z mMax = Z.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigmaProper = Jaguar.factor(++mN).sigma().subtract(mN);
      if (sigmaProper.compareTo(mMax) > 0) {
        mMax = sigmaProper;
        return Z.valueOf(mN);
      }
    }
  }
}

