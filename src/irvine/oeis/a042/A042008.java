package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042008 Numerators of continued fraction convergents to <code>sqrt(527)</code>.
 * @author Sean A. Irvine
 */
public class A042008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042008() {
    super(new long[] {-1, 0, 0, 0, 1056, 0, 0, 0}, new long[] {22, 23, 505, 528, 23737, 24265, 533302, 557567});
  }
}
