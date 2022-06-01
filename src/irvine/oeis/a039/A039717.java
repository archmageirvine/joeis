package irvine.oeis.a039;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A039717 Row sums of convolution triangle A030523.
 * @author Sean A. Irvine
 */
public class A039717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039717() {
    super(new long[] {-5, 5}, new long[] {1, 4});
  }
}
