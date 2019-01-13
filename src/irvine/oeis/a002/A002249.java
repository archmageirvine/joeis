package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002249.
 * @author Sean A. Irvine
 */
public class A002249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002249() {
    super(new long[] {-2, 1}, new long[] {2, 1});
  }
}
