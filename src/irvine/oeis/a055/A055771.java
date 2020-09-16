package irvine.oeis.a055;

import irvine.math.group.Monster;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055771 Multiplicity of irreducible character IRR2 of Monster simple group in n-th head character.
 * @author Sean A. Irvine
 */
public class A055771 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int j = 1; j <= Monster.NUMBER_CONJUCACY_CLASSES; ++j) {
      r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(2, j)).multiply(Monster.mckayThompson(j).a(mN)));
    }
    return r.divide(Monster.ORDER);
  }
}
