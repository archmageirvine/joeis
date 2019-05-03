package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a033.A033687;

/**
 * A005882 Theta series of planar hexagonal lattice <code>(A2)</code> with respect to deep hole.
 * @author Sean A. Irvine
 */
public class A005882 extends A033687 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
