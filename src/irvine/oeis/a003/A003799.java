package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003799 Order of simple Chevalley group A_n (9).
 * @author Sean A. Irvine
 */
public class A003799 extends A003793 {

  @Override
  protected Z q() {
    return Z.NINE;
  }
}
