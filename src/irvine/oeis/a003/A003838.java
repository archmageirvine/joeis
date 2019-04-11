package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003838 Order of (usually) simple Chevalley group D_n <code>(5)</code>.
 * @author Sean A. Irvine
 */
public class A003838 extends A003837 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
