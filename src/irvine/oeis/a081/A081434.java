package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A081434 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(2, ++mN).equals(Functions.REVERSE.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
