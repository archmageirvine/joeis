package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016878 <code>(5n+2)^6</code>.
 * @author Sean A. Irvine
 */
public class A016878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016878() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 117649, 2985984, 24137569, 113379904, 387420489, 1073741824});
  }
}
