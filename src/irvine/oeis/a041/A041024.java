package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041024 Numerators of continued fraction convergents to <code>sqrt(17)</code>.
 * @author Sean A. Irvine
 */
public class A041024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041024() {
    super(new long[] {1, 8}, new long[] {4, 33});
  }
}
