package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006235 Complexity of doubled cycle (regarding case <code>n = 2</code> as a multigraph).
 * @author Sean A. Irvine
 */
public class A006235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006235() {
    super(new long[] {-1, 10, -35, 52, -35, 10}, new long[] {1, 12, 75, 384, 1805, 8100});
  }
}

