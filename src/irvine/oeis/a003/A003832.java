package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003832 Order of universal Chevalley group <code>D_n (5)</code>.
 * @author Sean A. Irvine
 */
public class A003832 extends A003830 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
