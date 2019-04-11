package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042528 Numerators of continued fraction convergents to <code>sqrt(793)</code>.
 * @author Sean A. Irvine
 */
public class A042528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042528() {
    super(new long[] {-1, 0, 0, 0, 8786, 0, 0, 0}, new long[] {28, 169, 704, 4393, 246712, 1484665, 6185372, 38596897});
  }
}
