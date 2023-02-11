package irvine.oeis.a056;

import irvine.oeis.a049.A049311;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A056156 Number of connected bipartite graphs with n edges, no isolated vertices and a distinguished bipartite block, up to isomorphism.
 * @author Sean A. Irvine
 */
public class A056156 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A056156() {
    super(1, new A049311());
  }
}

