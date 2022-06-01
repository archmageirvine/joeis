package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215595 Number of strings of length n, formed from the 26-letter English alphabet, which contain the substring xy.
 * @author Sean A. Irvine
 */
public class A215595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215595() {
    super(new long[] {26, -677, 52}, new long[] {0, 0, 1});
  }
}
