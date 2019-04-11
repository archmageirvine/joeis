package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041030 Numerators of continued fraction convergents to <code>sqrt(20)</code>.
 * @author Sean A. Irvine
 */
public class A041030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041030() {
    super(new long[] {-1, 0, 18, 0}, new long[] {4, 9, 76, 161});
  }
}
