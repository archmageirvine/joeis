package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001687 a(n) = a(n-2) + a(n-5).
 * @author Sean A. Irvine
 */
public class A001687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001687() {
    super(new long[] {1, 0, 0, 1, 0}, new long[] {0, 1, 0, 1, 0});
  }
}
