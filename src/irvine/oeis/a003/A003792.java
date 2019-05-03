package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003792 Order of universal Chevalley group <code>A_n (9)</code>.
 * @author Sean A. Irvine
 */
public class A003792 extends A003787 {

  @Override
  protected Z q() {
    return Z.NINE;
  }
}
