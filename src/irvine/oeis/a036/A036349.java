package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036349 Numbers whose sum of prime factors (taken with multiplicity) is even.
 * @author Sean A. Irvine
 */
public class A036349 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sopfr().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
