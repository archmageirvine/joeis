package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042518 Numerators of continued fraction convergents to sqrt(788).
 * @author Sean A. Irvine
 */
public class A042518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042518() {
    super(new long[] {-1, 0, 786, 0}, new long[] {28, 393, 22036, 308897});
  }
}
