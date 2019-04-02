package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042199 Denominators of continued fraction convergents to sqrt(624).
 * @author Sean A. Irvine
 */
public class A042199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042199() {
    super(new long[] {-1, 0, 50, 0}, new long[] {1, 1, 49, 50});
  }
}
