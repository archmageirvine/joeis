package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a006.A006558;

/**
 * A019273.
 * @author Sean A. Irvine
 */
public class A019273 extends A006558 {

  @Override
  public Z next() {
    return super.next().add(mN - 1);
  }
}

