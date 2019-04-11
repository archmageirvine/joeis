package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003839 Order of (usually) simple Chevalley group D_n <code>(7)</code>.
 * @author Sean A. Irvine
 */
public class A003839 extends A003837 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
