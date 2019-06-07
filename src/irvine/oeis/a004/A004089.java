package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000041;

/**
 * A004089 Reverse digits of number of partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A004089 extends A000041 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

