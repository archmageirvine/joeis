package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003788 Order of universal Chevalley group A_n (4).
 * @author Sean A. Irvine
 */
public class A003788 extends A003787 {

  @Override
  protected Z q() {
    return Z.FOUR;
  }
}
