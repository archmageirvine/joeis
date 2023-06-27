package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192418 Molecular topological indices of the complete bipartite graphs K_{n,n}.
 * @author Sean A. Irvine
 */
public class A192418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192418() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {4, 48, 180, 448});
  }
}
