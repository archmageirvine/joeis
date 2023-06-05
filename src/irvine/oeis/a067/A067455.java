package irvine.oeis.a067;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067455 n! divided by the product of the decimal digits of n.
 * @author Georg Fischer
 */
public class A067455 extends Sequence0 {

  private int mN = -1;

  {
    next();
  }

  @Override
  public Z next() {
    ++mN;
    final long prod = ZUtils.digitProduct(mN);
    return (prod == 0) ? Z.ZERO : MemoryFactorial.SINGLETON.factorial(mN).divide(prod);
  }
}
