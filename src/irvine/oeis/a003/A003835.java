package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003835 Order of universal Chevalley group D_n (8).
 * @author Sean A. Irvine
 */
public class A003835 extends A003830 {

  @Override
  protected Z q() {
    return Z.EIGHT;
  }
}
