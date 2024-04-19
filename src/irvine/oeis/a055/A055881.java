package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055881 a(n) = largest m such that m! divides n.
 * @author Sean A. Irvine
 */
public class A055881 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    int k = 0;
    while (n.mod(Functions.FACTORIAL.z(k)).isZero()) {
      ++k;
    }
    return Z.valueOf(k - 1);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
