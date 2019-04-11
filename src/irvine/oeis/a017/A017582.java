package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017582 <code>a(n) = (12n + 5)^2</code>.
 * @author Sean A. Irvine
 */
public class A017582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017582() {
    super(new long[] {1, -3, 3}, new long[] {25, 289, 841});
  }
}
