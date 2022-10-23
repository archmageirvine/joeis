package irvine.oeis.a055;

import irvine.math.group.Monster;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055791 Table giving multiplicity of k-th irreducible character of Monster simple group in n-th head character, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A055791 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (n == 1 && m == 1) {
      return Z.ONE;
    }
    Z r = Z.ZERO;
    for (int j = 1; j <= Monster.NUMBER_CONJUCACY_CLASSES; ++j) {
      r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(m, j)).multiply(Monster.mckayThompson(j).a(n)));
    }
    return r.divide(Monster.ORDER);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN + 1 - mM, mM);
  }
}
