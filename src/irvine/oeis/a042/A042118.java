package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042118 Numerators of continued fraction convergents to <code>sqrt(584)</code>.
 * @author Sean A. Irvine
 */
public class A042118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042118() {
    super(new long[] {-1, 0, 290, 0}, new long[] {24, 145, 6984, 42049});
  }
}
