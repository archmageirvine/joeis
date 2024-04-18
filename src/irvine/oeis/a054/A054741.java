package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054741 Numbers m such that totient(m) &lt; cototient(m).
 * @author Sean A. Irvine
 */
public class A054741 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final long phi = Functions.PHI.l(n);
      if (phi < mN - phi) {
        return n;
      }
    }
  }
}
