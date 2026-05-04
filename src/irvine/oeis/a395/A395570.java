package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395570 allocated for Dalton Heilig.
 * @author Sean A. Irvine
 */
public class A395570 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING2.z(n, k).multiply(Z.THREE.pow(k)).multiply(Functions.FALLING_FACTORIAL.z(m, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
