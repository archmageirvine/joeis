package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008443;

/**
 * A005886 Theta series of f.c.c. lattice with respect to tetrahedral hole.
 * @author Sean A. Irvine
 */
public class A005886 extends A008443 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
