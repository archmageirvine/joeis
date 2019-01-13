package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118825.
 * @author Sean A. Irvine
 */
public class A118825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118825() {
    super(new long[] {-1, 0, 0, 0}, new long[] {-2, -1, 0, -1});
  }
}
