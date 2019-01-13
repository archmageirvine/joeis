package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001638.
 * @author Sean A. Irvine
 */
public class A001638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001638() {
    super(new long[] {1, 1, 0, 1}, new long[] {4, 1, 1, 4});
  }
}
