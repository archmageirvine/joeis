package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258684.
 * @author Sean A. Irvine
 */
public class A258684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258684() {
    super(new long[] {-1, 62}, new long[] {1, 63});
  }
}
