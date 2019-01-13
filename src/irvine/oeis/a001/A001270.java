package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001270.
 * @author Sean A. Irvine
 */
public class A001270 extends A001265 {

  {
    super.next();
  }

  @Override
  protected Z base() {
    return Z.TEN;
  }
}
