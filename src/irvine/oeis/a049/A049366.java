package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.z.Z;
import irvine.oeis.a003.A003216;

/**
 * A049366 Number of Hamiltonian planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A049366 extends A003216 {

  private boolean mFirst = true;

  @Override
  public long getCount(final Graph graph) {
    return graph.isHamiltonian() && graph.isPlanar() ? 1 : 0;
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
