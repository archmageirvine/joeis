package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041662 Numerators of continued fraction convergents to <code>sqrt(350)</code>.
 * @author Sean A. Irvine
 */
public class A041662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041662() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 898, 0, 0, 0, 0, 0}, new long[] {18, 19, 56, 131, 318, 449, 16482, 16931, 50344, 117619, 285582, 403201});
  }
}
