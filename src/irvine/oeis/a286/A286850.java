package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286850 Number of minimal dominating sets in the <code>2 X n</code> king graph.
 * @author Sean A. Irvine
 */
public class A286850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286850() {
    super(new long[] {-8, 0, 4, 2, 2, 0}, new long[] {2, 4, 6, 16, 20, 52});
  }
}
