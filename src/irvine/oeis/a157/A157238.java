package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.a006.A006345;

/**
 * A157238.
 * @author Sean A. Irvine
 */
public class A157238 extends A006345 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

