package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017415 <code>a(n) = (11*n+2)^3</code>.
 * @author Sean A. Irvine
 */
public class A017415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017415() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 2197, 13824, 42875});
  }
}
