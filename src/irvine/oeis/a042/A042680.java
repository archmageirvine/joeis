package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042680 Numerators of continued fraction convergents to sqrt(870).
 * @author Sean A. Irvine
 */
public class A042680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042680() {
    super(new long[] {-1, 0, 118, 0}, new long[] {29, 59, 3451, 6961});
  }
}
