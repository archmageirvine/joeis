package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158736 a(n) = 70*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158736() {
    super(new long[] {1, -3, 3}, new long[] {69, 279, 629});
  }
}
