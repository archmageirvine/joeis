package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042617 Denominators of continued fraction convergents to <code>sqrt(837)</code>.
 * @author Sean A. Irvine
 */
public class A042617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042617() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 24302, 0, 0, 0, 0, 0}, new long[] {1, 1, 14, 29, 391, 420, 23911, 24331, 340214, 704759, 9502081, 10206840});
  }
}
