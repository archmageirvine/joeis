package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A067455 n! divided by the product of the decimal digits of n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A067455 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private int mN = 0;

  @Override
  public Z next() {
    final Z f = mF.next();
    final long prod = ZUtils.digitProduct(++mN);
    return prod == 0 ? Z.ZERO : f.divide(prod);
  }
}
