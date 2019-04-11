package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158445 <code>25n^2 + 5</code>.
 * @author Sean A. Irvine
 */
public class A158445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158445() {
    super(new long[] {1, -3, 3}, new long[] {30, 105, 230});
  }
}
