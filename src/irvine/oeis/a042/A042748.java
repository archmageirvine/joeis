package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042748 Numerators of continued fraction convergents to sqrt(905).
 * @author Sean A. Irvine
 */
public class A042748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042748() {
    super(new long[] {-1, 0, 722, 0}, new long[] {30, 361, 21690, 260641});
  }
}
