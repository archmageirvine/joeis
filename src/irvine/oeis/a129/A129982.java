package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129982.
 * @author Sean A. Irvine
 */
public class A129982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129982() {
    super(new long[] {-1, 0, 0, 0, 2, 0}, new long[] {1, 0, 1, 1, 1, 1});
  }
}
