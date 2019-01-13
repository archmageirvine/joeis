package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161204.
 * @author Sean A. Irvine
 */
public class A161204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161204() {
    super(new long[] {2, 1, 1, 1}, new long[] {2, -1, -1, 1});
  }
}
