package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003797 Order of simple Chevalley group <code>A_n (7)</code>.
 * @author Sean A. Irvine
 */
public class A003797 extends A003793 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
