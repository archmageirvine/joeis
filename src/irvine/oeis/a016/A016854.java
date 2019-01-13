package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016854.
 * @author Sean A. Irvine
 */
public class A016854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016854() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 15625, 1000000, 11390625, 64000000, 244140625, 729000000});
  }
}
