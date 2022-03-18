package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a055.A055457;

/**
 * A112765 Exponent of highest power of 5 dividing n. Or, 5-adic valuation of n.
 * @author Georg Fischer
 */
public class A112765 extends A055457 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
