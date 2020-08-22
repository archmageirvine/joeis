package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211773 Prime-generating polynomial: 2*n^2 - 108*n + 1259.
 * @author Sean A. Irvine
 */
public class A211773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211773() {
    super(new long[] {1, -3, 3}, new long[] {1259, 1153, 1051});
  }
}
