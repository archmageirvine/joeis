package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158130 <code>121n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158130() {
    super(new long[] {-1, 2}, new long[] {120, 241});
  }
}
