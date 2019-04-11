package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003840 Order of (usually) simple Chevalley group D_n <code>(9)</code>.
 * @author Sean A. Irvine
 */
public class A003840 extends A003837 {

  @Override
  protected Z q() {
    return Z.NINE;
  }
}
