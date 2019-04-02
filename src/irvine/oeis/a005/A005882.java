package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a033.A033687;

/**
 * A005882 Theta series of planar hexagonal lattice (A2) with respect to deep hole.
 * @author Sean A. Irvine
 */
public class A005882 extends A033687 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
