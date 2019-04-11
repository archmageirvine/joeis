package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041944 Numerators of continued fraction convergents to <code>sqrt(495)</code>.
 * @author Sean A. Irvine
 */
public class A041944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041944() {
    super(new long[] {-1, 0, 178, 0}, new long[] {22, 89, 3938, 15841});
  }
}
