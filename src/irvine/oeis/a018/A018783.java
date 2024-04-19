package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000837;

/**
 * A018783 Number of partitions of n into parts having a common factor.
 * @author Sean A. Irvine
 */
public class A018783 extends A000041 {

  private final Sequence mA = new A000837();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
