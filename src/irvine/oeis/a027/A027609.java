package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027609.
 * @author Sean A. Irvine
 */
public class A027609 extends A027601 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
