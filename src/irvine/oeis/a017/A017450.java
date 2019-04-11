package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017450 <code>a(n) = (11*n + 5)^2</code>.
 * @author Sean A. Irvine
 */
public class A017450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017450() {
    super(new long[] {1, -3, 3}, new long[] {25, 256, 729});
  }
}
