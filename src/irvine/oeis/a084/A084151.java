package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084151 Binomial transform of a Pell convolution.
 * @author Sean A. Irvine
 */
public class A084151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084151() {
    super(new long[] {3, -19, 9}, new long[] {0, 0, 1});
  }
}
