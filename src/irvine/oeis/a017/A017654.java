package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017654 (12n+11)^2.
 * @author Sean A. Irvine
 */
public class A017654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017654() {
    super(new long[] {1, -3, 3}, new long[] {121, 529, 1225});
  }
}
