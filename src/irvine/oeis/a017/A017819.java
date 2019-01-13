package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017819.
 * @author Sean A. Irvine
 */
public class A017819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017819() {
    super(new long[] {1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
