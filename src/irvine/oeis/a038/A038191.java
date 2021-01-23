package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a034.A034166;

/**
 * A038191 A034166/2.
 * @author Sean A. Irvine
 */
public class A038191 extends A034166 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

