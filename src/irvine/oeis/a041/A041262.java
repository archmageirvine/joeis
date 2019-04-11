package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041262 Numerators of continued fraction convergents to <code>sqrt(143)</code>.
 * @author Sean A. Irvine
 */
public class A041262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041262() {
    super(new long[] {-1, 0, 24, 0}, new long[] {11, 12, 275, 287});
  }
}
