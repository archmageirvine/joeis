package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017390 <code>a(n) = (11*n)^2</code>.
 * @author Sean A. Irvine
 */
public class A017390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017390() {
    super(new long[] {1, -3, 3}, new long[] {0, 121, 484});
  }
}
