package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070383.
 * @author Sean A. Irvine
 */
public class A070383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070383() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 5, 25, 17, 13, 29});
  }
}
