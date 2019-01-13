package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a103.A103435;

/**
 * A006483.
 * @author Sean A. Irvine
 */
public class A006483 extends A103435 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

