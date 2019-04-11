package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042566 Numerators of continued fraction convergents to <code>sqrt(812)</code>.
 * @author Sean A. Irvine
 */
public class A042566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042566() {
    super(new long[] {-1, 0, 114, 0}, new long[] {28, 57, 3220, 6497});
  }
}
