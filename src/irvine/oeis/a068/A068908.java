package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A068908 Number of partitions of n modulo 5.
 * @author Georg Fischer
 */
public class A068908 extends A000041 {

  @Override
  public Z next() {
    return super.next().mod(Z.FIVE);
  }
}
