package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016938 <code>a(n) = (6*n + 2)^6</code>.
 * @author Sean A. Irvine
 */
public class A016938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016938() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 262144, 7529536, 64000000, 308915776, 1073741824, 3010936384L});
  }
}
