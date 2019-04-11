package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041344 Numerators of continued fraction convergents to <code>sqrt(186)</code>.
 * @author Sean A. Irvine
 */
public class A041344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041344() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {13, 14, 27, 41, 150, 641, 2073, 2714, 4787, 7501, 199813, 207314, 407127, 614441, 2250450, 9616241, 31099173, 40715414, 71814587, 112530001});
  }
}
