package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042415 Denominators of continued fraction convergents to <code>sqrt(735)</code>.
 * @author Sean A. Irvine
 */
public class A042415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042415() {
    super(new long[] {-1, 0, 488, 0}, new long[] {1, 9, 487, 4392});
  }
}
