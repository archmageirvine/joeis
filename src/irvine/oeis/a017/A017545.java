package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017545 a(n) = 12n + 2.
 * @author Sean A. Irvine
 */
public class A017545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017545() {
    super(new long[] {-1, 2}, new long[] {2, 14});
  }
}
