package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192491 Molecular topological indices of the complete tripartite graphs K_{n,n,n}.
 * @author Sean A. Irvine
 */
public class A192491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192491() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 240, 864, 2112});
  }
}
