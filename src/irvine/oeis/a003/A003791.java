package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003791 Order of universal Chevalley group <code>A_n (8)</code>.
 * @author Sean A. Irvine
 */
public class A003791 extends A003787 {

  @Override
  protected Z q() {
    return Z.EIGHT;
  }
}
