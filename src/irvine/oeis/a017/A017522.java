package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017522 <code>a(n) = (12*n)^2</code>.
 * @author Sean A. Irvine
 */
public class A017522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017522() {
    super(new long[] {1, -3, 3}, new long[] {0, 144, 576});
  }
}
