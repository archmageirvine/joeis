package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045819 Theta series of E_8 lattice with respect to midpoint of edge.
 * @author Sean A. Irvine
 */
public class A045819 extends A045823 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

