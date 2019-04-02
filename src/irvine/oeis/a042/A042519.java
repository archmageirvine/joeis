package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042519 Denominators of continued fraction convergents to sqrt(788).
 * @author Sean A. Irvine
 */
public class A042519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042519() {
    super(new long[] {-1, 0, 786, 0}, new long[] {1, 14, 785, 11004});
  }
}
