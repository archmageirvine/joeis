package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042405 Denominators of continued fraction convergents to <code>sqrt(730)</code>.
 * @author Sean A. Irvine
 */
public class A042405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042405() {
    super(new long[] {1, 54}, new long[] {1, 54});
  }
}
