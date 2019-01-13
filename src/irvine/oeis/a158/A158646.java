package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158646.
 * @author Sean A. Irvine
 */
public class A158646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158646() {
    super(new long[] {1, -3, 3}, new long[] {1, 55, 217});
  }
}
