package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158669.
 * @author Sean A. Irvine
 */
public class A158669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158669() {
    super(new long[] {1, -3, 3}, new long[] {870, 3570, 8070});
  }
}
