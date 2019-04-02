package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155701 a(n) = (4^n + 8)/3.
 * @author Sean A. Irvine
 */
public class A155701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155701() {
    super(new long[] {-4, 5}, new long[] {3, 4});
  }
}
