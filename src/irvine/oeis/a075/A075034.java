package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075034 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s1 = Functions.SIGMA0.z(++mN + 1);
      if (Functions.SIGMA0.z(mN).compareTo(s1) >= 0 && s1.compareTo(Functions.SIGMA0.z(mN + 2)) >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

