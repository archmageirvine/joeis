package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060550 a(n) is the number of distinct patterns (modulo geometric D_3-operations) with no other than strict 120-degree rotational symmetry which can be formed by an equilateral triangular arrangement of closely packed black and white cells satisfying the local matching rule of Pascal's triangle modulo 2, where n is the number of cells in each edge of the arrangement.
 * @author Sean A. Irvine
 */
public class A060550 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN / 3 + ((mN % 3) & 1) - 1).subtract(Z.ONE.shiftLeft((mN + 3) / 6 - ((mN % 6) == 1 ? 0 : 1)));
  }
}

