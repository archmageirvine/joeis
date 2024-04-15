package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034090 Numbers k whose sum of proper divisors (A001065(k)) exceeds that of all smaller numbers.
 * @author Sean A. Irvine
 */
public class A034090 extends Sequence1 {

  private Z mMax = Z.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigmaProper = Functions.SIGMA.z(++mN).subtract(mN);
      if (sigmaProper.compareTo(mMax) > 0) {
        mMax = sigmaProper;
        return Z.valueOf(mN);
      }
    }
  }
}

