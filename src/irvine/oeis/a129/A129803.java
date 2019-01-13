package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129803.
 * @author Sean A. Irvine
 */
public class A129803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129803() {
    super(new long[] {1, -15, 15}, new long[] {10, 136, 1891});
  }
}
