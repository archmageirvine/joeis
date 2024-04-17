package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036349 Numbers whose sum of prime factors (taken with multiplicity) is even.
 * @author Sean A. Irvine
 */
public class A036349 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(++mN).isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
