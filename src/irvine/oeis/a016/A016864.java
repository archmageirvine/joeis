package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016864 (5n+1)^4.
 * @author Sean A. Irvine
 */
public class A016864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016864() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1296, 14641, 65536, 194481});
  }
}
