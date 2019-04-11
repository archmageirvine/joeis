package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158665 <code>a(n) = 841*n^2 + 29</code>.
 * @author Sean A. Irvine
 */
public class A158665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158665() {
    super(new long[] {1, -3, 3}, new long[] {29, 870, 3393});
  }
}
