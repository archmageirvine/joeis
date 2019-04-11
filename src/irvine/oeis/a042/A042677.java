package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042677 Denominators of continued fraction convergents to <code>sqrt(868)</code>.
 * @author Sean A. Irvine
 */
public class A042677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042677() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7688126, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 13, 249, 511, 9958, 60259, 130476, 7627867, 15386210, 99945127, 1914343623, 3928632373L, 76558358710L, 463278784633L, 1003115927976L});
  }
}
