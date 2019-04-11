package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042431 Denominators of continued fraction convergents to <code>sqrt(743)</code>.
 * @author Sean A. Irvine
 */
public class A042431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042431() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1428048, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 31, 841, 5918, 6759, 26195, 1421289, 4290062, 5711351, 44269519, 1200988364, 8451188067L, 9652176431L, 37407717360L});
  }
}
