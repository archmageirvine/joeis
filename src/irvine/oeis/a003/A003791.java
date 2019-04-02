package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003791 Order of universal Chevalley group A_n (8).
 * @author Sean A. Irvine
 */
public class A003791 extends A003787 {

  @Override
  protected Z q() {
    return Z.EIGHT;
  }
}
