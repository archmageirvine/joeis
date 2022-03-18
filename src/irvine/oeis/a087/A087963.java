package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A087963 Exponent of highest power of 2 dividing 3*prime(n)+1.
 * @author Georg Fischer
 */
public class A087963 extends A000040 {

  /** Construct the sequence. */
  public A087963() {
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(Z.TWO, super.next().multiply(3).add(1)));
  }
}
