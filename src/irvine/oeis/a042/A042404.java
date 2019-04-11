package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042404 Numerators of continued fraction convergents to <code>sqrt(730)</code>.
 * @author Sean A. Irvine
 */
public class A042404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042404() {
    super(new long[] {1, 54}, new long[] {27, 1459});
  }
}
