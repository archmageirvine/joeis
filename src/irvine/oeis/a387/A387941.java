package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387941 Positive numbers k such that gpf(k)^2 &lt; 2*k where gpf = A006530.
 * @author Sean A. Irvine
 */
public class A387941 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(++mN).square().compareTo(2L * mN) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
