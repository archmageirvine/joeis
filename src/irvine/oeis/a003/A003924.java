package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003924 Order of universal Chevalley group B_n (7).
 * @author Sean A. Irvine
 */
public class A003924 extends A003920 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
