package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042404 Numerators of continued fraction convergents to sqrt(730).
 * @author Sean A. Irvine
 */
public class A042404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042404() {
    super(new long[] {1, 54}, new long[] {27, 1459});
  }
}
