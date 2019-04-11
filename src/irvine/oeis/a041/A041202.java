package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041202 Numerators of continued fraction convergents to <code>sqrt(112)</code>.
 * @author Sean A. Irvine
 */
public class A041202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041202() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 254, 0, 0, 0, 0, 0}, new long[] {10, 11, 21, 53, 74, 127, 2614, 2741, 5355, 13451, 18806, 32257});
  }
}
