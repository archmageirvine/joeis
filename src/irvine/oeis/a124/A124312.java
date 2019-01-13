package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124312.
 * @author Sean A. Irvine
 */
public class A124312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124312() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 0, 1, 0, 1});
  }
}
