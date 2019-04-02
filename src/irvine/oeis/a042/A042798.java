package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042798 Numerators of continued fraction convergents to sqrt(930).
 * @author Sean A. Irvine
 */
public class A042798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042798() {
    super(new long[] {-1, 0, 122, 0}, new long[] {30, 61, 3690, 7441});
  }
}
