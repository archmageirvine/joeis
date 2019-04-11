package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042343 Denominators of continued fraction convergents to <code>sqrt(698)</code>.
 * @author Sean A. Irvine
 */
public class A042343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042343() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 10198, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 7, 12, 19, 31, 81, 193, 10117, 20427, 50971, 71398, 122369, 193767, 316136, 826039, 1968214});
  }
}
