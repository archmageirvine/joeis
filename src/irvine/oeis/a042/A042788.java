package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042788 Numerators of continued fraction convergents to sqrt(925).
 * @author Sean A. Irvine
 */
public class A042788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042788() {
    super(new long[] {1, 0, 0, 0, 0, 1764, 0, 0, 0, 0}, new long[] {30, 61, 152, 365, 882, 53285, 107452, 268189, 643830, 1555849});
  }
}
