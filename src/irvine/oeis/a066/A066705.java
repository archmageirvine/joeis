package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066705 Greatest k &lt; n such that phi(k) = phi(n) if such k exists, otherwise 0.
 * @author Sean A. Irvine
 */
public class A066705 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = InverseEuler.inversePhi(Functions.PHI.z(++mN)).floor(Z.valueOf(mN - 1));
    return t == null ? Z.ZERO : t;
  }
}
