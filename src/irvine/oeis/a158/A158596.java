package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158596.
 * @author Sean A. Irvine
 */
public class A158596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158596() {
    super(new long[] {1, -3, 3}, new long[] {37, 151, 341});
  }
}
