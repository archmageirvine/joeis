package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001229 Numbers k such that phi(sigma(k)) = k.
 * @author Sean A. Irvine
 */
public class A001229 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Functions.SIGMA1.z(++mN);
      final Z t = Functions.PHI.z(n);
      if (t.longValue() == mN) {
        return t;
      }
    }
  }
}
