package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041101 Denominators of continued fraction convergents to <code>sqrt(58)</code>.
 * @author Sean A. Irvine
 */
public class A041101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041101() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 198, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 8, 13, 190, 203, 393, 596, 989, 1585, 2574});
  }
}
