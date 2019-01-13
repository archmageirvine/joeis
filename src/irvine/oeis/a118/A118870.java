package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118870.
 * @author Sean A. Irvine
 */
public class A118870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118870() {
    super(new long[] {-1, 2, -1, 2}, new long[] {1, 2, 4, 8});
  }
}
