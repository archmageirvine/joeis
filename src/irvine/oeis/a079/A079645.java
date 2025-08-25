package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079645 Numbers j such that the integer part of the cube root of j divides j.
 * @author Sean A. Irvine
 */
public class A079645 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.CBRT.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

