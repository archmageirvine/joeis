package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003834 Order of universal Chevalley group <code>D_n (7)</code>.
 * @author Sean A. Irvine
 */
public class A003834 extends A003830 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
