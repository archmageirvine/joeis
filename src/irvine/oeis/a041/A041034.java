package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041034 Numerators of continued fraction convergents to <code>sqrt(22)</code>.
 * @author Sean A. Irvine
 */
public class A041034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041034() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 394, 0, 0, 0, 0, 0}, new long[] {4, 5, 14, 61, 136, 197, 1712, 1909, 5530, 24029, 53588, 77617});
  }
}
