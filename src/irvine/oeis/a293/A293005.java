package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293005 Number of associative, quasitrivial, and order-preserving binary operations on the n-element set <code>{1,</code>...,n}.
 * @author Sean A. Irvine
 */
public class A293005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293005() {
    super(new long[] {-2, 0, 3}, new long[] {0, 1, 4});
  }
}
