package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041094 Numerators of continued fraction convergents to <code>sqrt(55)</code>.
 * @author Sean A. Irvine
 */
public class A041094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041094() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {7, 15, 37, 89, 1283, 2655, 6593, 15841});
  }
}
