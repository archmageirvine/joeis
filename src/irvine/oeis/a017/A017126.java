package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017126 <code>a(n) = (8*n + 5)^2</code>.
 * @author Sean A. Irvine
 */
public class A017126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017126() {
    super(new long[] {1, -3, 3}, new long[] {25, 169, 441});
  }
}
