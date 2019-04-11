package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041991 Denominators of continued fraction convergents to <code>sqrt(518)</code>.
 * @author Sean A. Irvine
 */
public class A041991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041991() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4734, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 25, 79, 104, 4655, 4759, 18932, 118351, 373985, 492336});
  }
}
