package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055457 5^a(n) exactly divides 5n. Or, 5-adic valuation of 5n.
 * @author Georg Fischer
 */
public class A055457 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.valuation(Z.FIVE.multiply(mN), Z.FIVE));
  }
}
