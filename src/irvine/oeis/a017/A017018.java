package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017018 <code>a(n) = (7*n + 3)^2</code>.
 * @author Sean A. Irvine
 */
public class A017018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017018() {
    super(new long[] {1, -3, 3}, new long[] {9, 100, 289});
  }
}
