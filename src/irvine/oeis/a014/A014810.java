package irvine.oeis.a014;

import irvine.math.group.Monster;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014810 Multiplicity of trivial character in V_n, where V = Sum V_n is the graded module for the Monster simple group.
 * @author Sean A. Irvine
 */
public class A014810 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z r = Z.ZERO;
    for (int j = 1; j <= Monster.NUMBER_CONJUCACY_CLASSES; ++j) {
      // Actually Monster.chi(1) is always 1
      r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(1, j)).multiply(Monster.mckayThompson(j).a(mN)));
    }
    return r.divide(Monster.ORDER);
  }
}
