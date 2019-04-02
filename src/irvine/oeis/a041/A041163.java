package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041163 Denominators of continued fraction convergents to sqrt(91).
 * @author Sean A. Irvine
 */
public class A041163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041163() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3148, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 11, 13, 76, 89, 165, 3059, 3224, 6283, 34639, 40922, 239249, 280171, 519420});
  }
}
