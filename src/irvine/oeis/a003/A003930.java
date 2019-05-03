package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003930 Order of simple Chevalley group <code>B_n (9)</code>.
 * @author Sean A. Irvine
 */
public class A003930 extends A003928 {

  @Override
  protected Z q() {
    return Z.NINE;
  }
}
