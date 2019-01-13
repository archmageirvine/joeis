package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193680.
 * @author Sean A. Irvine
 */
public class A193680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193680() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 0, 2, 1});
  }
}
