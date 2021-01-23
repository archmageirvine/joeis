package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158326 484n + 1.
 * @author Sean A. Irvine
 */
public class A158326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158326() {
    super(new long[] {-1, 2}, new long[] {485, 969});
  }
}
