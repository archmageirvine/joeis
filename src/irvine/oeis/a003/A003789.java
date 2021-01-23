package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003789 Order of universal Chevalley group A_n (5).
 * @author Sean A. Irvine
 */
public class A003789 extends A003787 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
