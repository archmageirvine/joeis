package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041646 Numerators of continued fraction convergents to <code>sqrt(342)</code>.
 * @author Sean A. Irvine
 */
public class A041646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041646() {
    super(new long[] {-1, 0, 74, 0}, new long[] {18, 37, 1350, 2737});
  }
}
