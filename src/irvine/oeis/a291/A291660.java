package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291660.
 * @author Sean A. Irvine
 */
public class A291660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291660() {
    super(new long[] {1, 0, -1, 2}, new long[] {2, 3, 5, 7});
  }
}
