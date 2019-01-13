package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161365.
 * @author Sean A. Irvine
 */
public class A161365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161365() {
    super(new long[] {-1, 1, 1}, new long[] {9, 9, 19});
  }
}
