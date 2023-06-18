package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A008827 Number of proper partitions of a set of n labeled elements.
 * @author Sean A. Irvine
 */
public class A008827 extends A000110 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
