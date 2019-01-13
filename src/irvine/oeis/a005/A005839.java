package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005839.
 * @author Sean A. Irvine
 */
public class A005839 extends A005837 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
