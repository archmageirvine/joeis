package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034091 Records for sum of proper divisors function.
 * @author Sean A. Irvine
 */
public class A034091 implements Sequence {

  private Z mMax = Z.valueOf(-2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigmaProper = Jaguar.factor(++mN).sigma().subtract(mN);
      if (sigmaProper.compareTo(mMax) > 0) {
        mMax = sigmaProper;
        return mMax;
      }
    }
  }
}

