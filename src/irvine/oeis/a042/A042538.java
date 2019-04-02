package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042538 Numerators of continued fraction convergents to sqrt(798).
 * @author Sean A. Irvine
 */
public class A042538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042538() {
    super(new long[] {-1, 0, 226, 0}, new long[] {28, 113, 6356, 25537});
  }
}
