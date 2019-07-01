package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009645;

/**
 * A024339.
 * @author Sean A. Irvine
 */
public class A024339 extends A009645 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

