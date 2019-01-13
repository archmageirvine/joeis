package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289846.
 * @author Sean A. Irvine
 */
public class A289846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289846() {
    super(new long[] {-1, -1, 3, 1}, new long[] {1, 2, 4, 9});
  }
}
