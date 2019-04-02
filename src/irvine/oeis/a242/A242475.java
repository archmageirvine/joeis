package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242475 a(n) = 2^n + 8.
 * @author Sean A. Irvine
 */
public class A242475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242475() {
    super(new long[] {-2, 3}, new long[] {9, 10});
  }
}
