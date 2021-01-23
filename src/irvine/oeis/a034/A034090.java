package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034090 Numbers n such that sum of proper divisors of n exceeds that of all smaller numbers.
 * @author Sean A. Irvine
 */
public class A034090 implements Sequence {

  private Z mMax = Z.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigmaProper = Cheetah.factor(++mN).sigma().subtract(mN);
      if (sigmaProper.compareTo(mMax) > 0) {
        mMax = sigmaProper;
        return Z.valueOf(mN);
      }
    }
  }
}

