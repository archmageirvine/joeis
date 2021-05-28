package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A047967 Number of partitions of n with some part repeated.
 * @author Sean A. Irvine
 */
public class A047967 extends A000041 {

  private final Sequence mA = new A000009();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
