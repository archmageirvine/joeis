package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055788 Number of symmetric types of (5,2n)-hypergraphs under action of complementing group C(5,2).
 * @author Sean A. Irvine
 */
public class A055788 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final int[][] GF = {
    {62, 1, 16},
    {-310, 2, 8},
    {1240, 4, 4},
    {-1984, 8, 2},
    {1024, 16, 1}
  };
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final int[] t : GF) {
      sum = sum.add(RING.coeff(RING.one(), RING.pow(RING.oneMinusXToTheN(t[1]), t[2], mN), mN).multiply(t[0]));
    }
    return sum.divide(32);
  }
}
