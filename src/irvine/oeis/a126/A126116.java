package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126116.
 * @author Sean A. Irvine
 */
public class A126116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126116() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 1, 1});
  }
}
