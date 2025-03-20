package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006460 Image of n after 3k iterates of '3x+1' map (k large).
 * @author Sean A. Irvine
 */
public class A006460 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    Z t = m;
    while (true) {
      m = Functions.COLLATZ.z(Functions.COLLATZ.z(Functions.COLLATZ.z(m)));
      if (m.equals(t)) {
        return m;
      }
      t = m;
    }
  }
}
