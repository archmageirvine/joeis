package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003798 Order of simple Chevalley group <code>A_n (8)</code>.
 * @author Sean A. Irvine
 */
public class A003798 extends A003793 {

  @Override
  protected Z q() {
    return Z.EIGHT;
  }
}
