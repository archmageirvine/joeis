package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A389835 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (CR.E.multiply(Functions.FIBONACCI.z(++mN).bitCount()).compareTo(CR.valueOf(mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
