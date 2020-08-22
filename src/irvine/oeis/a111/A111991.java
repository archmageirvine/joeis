package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111991 Second convolution of A111989.
 * @author Sean A. Irvine
 */
public class A111991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111991() {
    super(new long[] {-512, 0, 1152, -192, -864, 288, 192, -108, 18}, new long[] {1, 18, 216, 2136, 18864, 154656, 1203072, 9000576, 65339136});
  }
}
