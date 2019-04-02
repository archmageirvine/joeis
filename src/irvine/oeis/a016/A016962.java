package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016962 a(n) = (6*n + 4)^6.
 * @author Sean A. Irvine
 */
public class A016962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016962() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 1000000, 16777216, 113379904, 481890304, 1544804416, 4096000000L});
  }
}
