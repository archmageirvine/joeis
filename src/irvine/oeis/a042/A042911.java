package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042911 Denominators of continued fraction convergents to <code>sqrt(987)</code>.
 * @author Sean A. Irvine
 */
public class A042911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042911() {
    super(new long[] {-1, 0, 0, 0, 754, 0, 0, 0}, new long[] {1, 2, 5, 12, 749, 1510, 3769, 9048});
  }
}
