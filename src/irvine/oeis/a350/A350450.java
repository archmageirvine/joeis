package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs;
import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A350450 Triangle read by rows: T(n,k) is the number of unlabeled weakly connected acyclic digraphs with n arcs and k vertices, n &gt;= 0, k = 1..n+1.
 * @author Gregory Morse
 */
public class A350450 extends Triangle {
  private final UnlabeledAcyclicDigraphs mDags = new UnlabeledAcyclicDigraphs(true);

  @Override
  protected Z compute(final int n, final int k) {
    return mDags.row(k + 1, Kind.CONNECTED).coeff(n).toZ();
  }
}
