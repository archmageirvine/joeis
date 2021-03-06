package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a065.A065825;

/**
 * A005047 Minimal span of set of n elements with no 3-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005047 extends A065825 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
