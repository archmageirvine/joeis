package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005887 Theta series of f.c.c. lattice with respect to octahedral hole.
 * @author Sean A. Irvine
 */
public class A005887 extends A005875 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
