package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003790 Order of universal Chevalley group A_n (7).
 * @author Sean A. Irvine
 */
public class A003790 extends A003787 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
