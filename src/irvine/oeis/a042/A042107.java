package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042107 Denominators of continued fraction convergents to sqrt(578).
 * @author Sean A. Irvine
 */
public class A042107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042107() {
    super(new long[] {-1, 0, 1154, 0}, new long[] {1, 24, 1153, 27696});
  }
}
