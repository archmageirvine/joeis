package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041902 Numerators of continued fraction convergents to <code>sqrt(473)</code>.
 * @author Sean A. Irvine
 */
public class A041902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041902() {
    super(new long[] {-1, 0, 0, 0, 174, 0, 0, 0}, new long[] {21, 22, 65, 87, 3719, 3806, 11331, 15137});
  }
}
