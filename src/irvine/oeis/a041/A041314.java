package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041314 Numerators of continued fraction convergents to sqrt(171).
 * @author Sean A. Irvine
 */
public class A041314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041314() {
    super(new long[] {-1, 0, 340, 0}, new long[] {13, 170, 4433, 57799});
  }
}
