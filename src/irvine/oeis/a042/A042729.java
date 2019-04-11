package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042729 Denominators of continued fraction convergents to <code>sqrt(894)</code>.
 * @author Sean A. Irvine
 */
public class A042729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042729() {
    super(new long[] {-1, 0, 0, 0, 598, 0, 0, 0}, new long[] {1, 1, 9, 10, 589, 599, 5381, 5980});
  }
}
