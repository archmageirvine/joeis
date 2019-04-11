package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041472 Numerators of continued fraction convergents to <code>sqrt(252)</code>.
 * @author Sean A. Irvine
 */
public class A041472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041472() {
    super(new long[] {-1, 0, 0, 0, 254, 0, 0, 0}, new long[] {15, 16, 111, 127, 3921, 4048, 28209, 32257});
  }
}
