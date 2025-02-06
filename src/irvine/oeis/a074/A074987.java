package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074987 a(n) is the least m not equal to n such that phi(m) = phi(n).
 * @author Sean A. Irvine
 */
public class A074987 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    for (final Z t : InverseEuler.inversePhi(Functions.PHI.z(mN))) {
      if (!t.equals(mN)) {
        return t;
      }
    }
    throw new RuntimeException();
  }
}
