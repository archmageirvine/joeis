package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003925 Order of universal Chevalley group B_n (8).
 * @author Sean A. Irvine
 */
public class A003925 extends A003920 {

  @Override
  protected Z q() {
    return Z.EIGHT;
  }
}
