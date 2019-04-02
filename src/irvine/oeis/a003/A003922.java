package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003922 Order of universal Chevalley group B_n (5).
 * @author Sean A. Irvine
 */
public class A003922 extends A003920 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
