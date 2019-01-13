package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051798.
 * @author Sean A. Irvine
 */
public class A051798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051798() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 13, 55, 155, 350});
  }
}
