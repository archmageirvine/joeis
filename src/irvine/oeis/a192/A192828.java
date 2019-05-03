package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192828 Molecular topological indices of the <code>n X n</code> grid graphs.
 * @author Sean A. Irvine
 */
public class A192828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192828() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {48, 440, 2008, 6468, 16736, 37248});
  }
}
