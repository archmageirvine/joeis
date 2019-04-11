package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111766 Numbers occurring in three Pythagorean triples of the form: odd: <code>a, (a^2-1)/2, (a^2+1)/2</code> or even: <code>a, a^2/4-1, a^2/4+1</code>.
 * @author Sean A. Irvine
 */
public class A111766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111766() {
    super(new long[] {-1, 5, 5}, new long[] {0, 5, 24});
  }
}
