package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204062.
 * @author Sean A. Irvine
 */
public class A204062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204062() {
    super(new long[] {-1, 4, 10, 4}, new long[] {1, 4, 26, 148});
  }
}
