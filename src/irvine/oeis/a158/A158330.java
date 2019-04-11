package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158330 <code>484n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158330() {
    super(new long[] {-1, 2}, new long[] {483, 967});
  }
}
