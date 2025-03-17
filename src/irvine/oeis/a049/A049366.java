package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a003.A003216;

/**
 * A049366 Number of Hamiltonian planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A049366 extends A003216 {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A049366() {
    super(() -> graph -> graph.isHamiltonian() && graph.isPlanar() ? 1 : 0);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return res;
  }
}
