package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037652.
 * @author Sean A. Irvine
 */
public class A037652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037652() {
    super(new long[] {-10, 1, 0, 10}, new long[] {3, 30, 301, 3013});
  }
}
