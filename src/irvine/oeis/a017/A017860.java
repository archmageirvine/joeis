package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017860.
 * @author Sean A. Irvine
 */
public class A017860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017860() {
    super(new long[] {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1});
  }
}
