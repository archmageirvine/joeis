package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003921 Order of universal Chevalley group B_n (4).
 * @author Sean A. Irvine
 */
public class A003921 extends A003920 {

  @Override
  protected Z q() {
    return Z.FOUR;
  }
}
