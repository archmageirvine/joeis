package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017581 <code>a(n) = 12*n + 5</code>.
 * @author Sean A. Irvine
 */
public class A017581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017581() {
    super(new long[] {-1, 2}, new long[] {5, 17});
  }
}
