package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041706 Numerators of continued fraction convergents to <code>sqrt(373)</code>.
 * @author Sean A. Irvine
 */
public class A041706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041706() {
    super(new long[] {1, 0, 0, 0, 0, 10236, 0, 0, 0, 0}, new long[] {19, 58, 309, 1603, 5118, 196087, 593379, 3162982, 16408289, 52387849});
  }
}
