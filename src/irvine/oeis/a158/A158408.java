package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158408.
 * @author Sean A. Irvine
 */
public class A158408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158408() {
    super(new long[] {1, -3, 3}, new long[] {898, 3596, 8094});
  }
}
