package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078776 Numbers k such that phi(k-1) &lt; phi(k) &lt; phi(k+1), where phi is the Euler totient function (A000010).
 * @author Sean A. Irvine
 */
public class A078776 extends Sequence1 {

  private long mN = 105;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (Functions.PHI.l(mN - 1) < phi && phi < Functions.PHI.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

