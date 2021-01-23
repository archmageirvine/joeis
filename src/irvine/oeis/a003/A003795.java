package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003795 Order of simple Chevalley group A_n (5).
 * @author Sean A. Irvine
 */
public class A003795 extends A003793 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
