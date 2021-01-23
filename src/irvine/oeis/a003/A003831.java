package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003831 Order of universal Chevalley group D_n (4).
 * @author Sean A. Irvine
 */
public class A003831 extends A003830 {

  @Override
  protected Z q() {
    return Z.FOUR;
  }
}
