package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048512.
 * @author Sean A. Irvine
 */
public class A048512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048512() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 65, 210, 536});
  }
}
