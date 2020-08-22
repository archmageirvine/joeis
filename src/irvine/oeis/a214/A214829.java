package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214829 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 1, a(1) = a(2) = 7.
 * @author Sean A. Irvine
 */
public class A214829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214829() {
    super(new long[] {1, 1, 1}, new long[] {1, 7, 7});
  }
}
