package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a051.A051924;

/**
 * A024482.
 * @author Sean A. Irvine
 */
public class A024482 extends A051924 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
