package irvine.oeis.a055;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a049.A049312;

/**
 * A055192 Number of bipartite graphs with n vertices, no isolated vertices and a distinguished bipartite block, up to isomorphism.
 * @author Georg Fischer
 */
public class A055192 extends DifferenceSequence {

  /** Construct the sequence. */
  public A055192() {
    super(2, new DifferenceSequence(new A049312()));
  }
}
