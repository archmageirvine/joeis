package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042175 Denominators of continued fraction convergents to sqrt(612).
 * @author Sean A. Irvine
 */
public class A042175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042175() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 4354, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 19, 23, 65, 88, 4289, 4377, 13043, 17420, 82723, 100143, 283009, 383152});
  }
}
