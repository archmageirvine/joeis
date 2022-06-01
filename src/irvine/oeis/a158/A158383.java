package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158383 625n + 1.
 * @author Sean A. Irvine
 */
public class A158383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158383() {
    super(new long[] {-1, 2}, new long[] {626, 1251});
  }
}
