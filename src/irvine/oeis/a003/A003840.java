package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003840 Order of (usually) simple Chevalley group D_n (9).
 * @author Sean A. Irvine
 */
public class A003840 extends A003837 {

  @Override
  protected Z q() {
    return Z.NINE;
  }
}
