package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054879 Closed walks of length <code>2n</code> along the edges of a cube based at a vertex.
 * @author Sean A. Irvine
 */
public class A054879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054879() {
    super(new long[] {-9, 10}, new long[] {1, 3});
  }
}
