package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204467.
 * @author Sean A. Irvine
 */
public class A204467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204467() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 8, 25, 50});
  }
}
