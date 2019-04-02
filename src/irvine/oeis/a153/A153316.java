package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153316 Numerators of continued fraction convergents to sqrt(5/4).
 * @author Sean A. Irvine
 */
public class A153316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153316() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 9, 19, 161});
  }
}
