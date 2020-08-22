package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050405 Partial sums of A051879.
 * @author Sean A. Irvine
 */
public class A050405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050405() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 15, 84, 308, 882, 2142, 4620});
  }
}
