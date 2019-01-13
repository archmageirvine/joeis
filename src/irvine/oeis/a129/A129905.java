package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129905.
 * @author Sean A. Irvine
 */
public class A129905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129905() {
    super(new long[] {-1, 2, 2}, new long[] {1, 3, 6});
  }
}
