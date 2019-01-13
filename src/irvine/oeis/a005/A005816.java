package irvine.oeis.a005;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.CycleIndexReadBigN;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005816.
 * @author Sean A. Irvine
 */
public class A005816 implements Sequence {

  private static final CycleIndex S2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex S4 = SymmetricGroup.create(4).cycleIndex();
  private int mN = -1;

  private CycleIndex e(final int n) {
    return new CycleIndex("E(" + n + ")", MultivariateMonomial.create(1, n));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex c = SymmetricGroup.create(2 * mN).cycleIndex().wreath(S2);
    //    System.out.println(c);
    final CycleIndex e = e(mN).wreath(S4);
    //   System.out.println(e);
    return CycleIndexReadBigN.bigN(e, c).toZ();
  }
}
