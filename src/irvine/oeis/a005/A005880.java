package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008438;

/**
 * A005880 Theta series of D_4 lattice with respect to edge.
 * @author Sean A. Irvine
 */
public class A005880 extends A008438 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
