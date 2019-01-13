package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257543.
 * @author Sean A. Irvine
 */
public class A257543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257543() {
    super(new long[] {-1, 1, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 0, 0, 1});
  }
}
