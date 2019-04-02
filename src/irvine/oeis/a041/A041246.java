package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041246 Numerators of continued fraction convergents to sqrt(135).
 * @author Sean A. Irvine
 */
public class A041246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041246() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 488, 0, 0, 0, 0, 0, 0, 0}, new long[] {11, 12, 23, 35, 58, 93, 151, 244, 5519, 5763, 11282, 17045, 28327, 45372, 73699, 119071});
  }
}
