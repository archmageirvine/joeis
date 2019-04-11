package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042784 Numerators of continued fraction convergents to <code>sqrt(923)</code>.
 * @author Sean A. Irvine
 */
public class A042784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042784() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1276, 0, 0, 0, 0, 0}, new long[] {30, 61, 91, 152, 243, 638, 38523, 77684, 116207, 193891, 310098, 814087});
  }
}
