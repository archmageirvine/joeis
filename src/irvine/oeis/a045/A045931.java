package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a171.A171967;

/**
 * A045931 Number of partitions of n with equal number of even and odd parts.
 * @author Sean A. Irvine
 */
public class A045931 extends A000041 {

  private final Sequence mA = new A171967();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
