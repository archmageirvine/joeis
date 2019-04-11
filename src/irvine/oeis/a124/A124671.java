package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124671 Row sums of A126277 = binomial transform of <code>(1, 2, 2, 3, 4, 4, 4,</code>...).
 * @author Sean A. Irvine
 */
public class A124671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124671() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 3, 7, 16, 37});
  }
}
