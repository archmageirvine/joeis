package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017250 a(n) = (9*n + 7)^6.
 * @author Sean A. Irvine
 */
public class A017250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017250() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {117649, 16777216, 244140625, 1544804416, 6321363049L, 19770609664L, 51520374361L});
  }
}
