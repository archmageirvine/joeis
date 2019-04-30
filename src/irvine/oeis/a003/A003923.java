package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003923 Order of universal Chevalley group B_n <code>(2)</code> or symplectic group <code>Sp(2n,2)</code>.
 * @author Sean A. Irvine
 */
public class A003923 extends A003920 {

  @Override
  protected Z q() {
    return Z.TWO;
  }

  @Override
  protected int start() {
    return -1;
  }
}
