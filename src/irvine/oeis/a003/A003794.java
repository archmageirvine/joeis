package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003794 Order of simple Chevalley group A_n (4).
 * @author Sean A. Irvine
 */
public class A003794 extends A003793 {

  @Override
  protected Z q() {
    return Z.FOUR;
  }
}
