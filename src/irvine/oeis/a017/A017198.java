package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017198 <code>a(n) = (9*n + 3)^2</code>.
 * @author Sean A. Irvine
 */
public class A017198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017198() {
    super(new long[] {1, -3, 3}, new long[] {9, 144, 441});
  }
}
