package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017870.
 * @author Sean A. Irvine
 */
public class A017870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017870() {
    super(new long[] {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1});
  }
}
