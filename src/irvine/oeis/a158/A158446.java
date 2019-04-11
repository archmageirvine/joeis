package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158446 <code>25n^2 - 5</code>.
 * @author Sean A. Irvine
 */
public class A158446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158446() {
    super(new long[] {1, -3, 3}, new long[] {20, 95, 220});
  }
}
