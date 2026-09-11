package irvine.oeis.a049;

import irvine.math.nauty.GenerateGraphs;
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
    super(() -> graph -> graph.isHamiltonian() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    super.graphGenInit(gg);
    gg.setPruner((graph, n) -> !graph.isPlanar());
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
