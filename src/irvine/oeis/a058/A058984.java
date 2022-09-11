package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058984 Number of partitions of n in which number of parts is not 2.
 * @author Sean A. Irvine
 */
public class A058984 extends A000041 {

  @Override
  public Z next() {
    return super.next().subtract(mN / 2);
  }
}
