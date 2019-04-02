package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042073 Denominators of continued fraction convergents to sqrt(560).
 * @author Sean A. Irvine
 */
public class A042073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042073() {
    super(new long[] {-1, 0, 0, 0, 142, 0, 0, 0}, new long[] {1, 1, 2, 3, 140, 143, 283, 426});
  }
}
