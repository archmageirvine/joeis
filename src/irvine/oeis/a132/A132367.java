package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132367.
 * @author Sean A. Irvine
 */
public class A132367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132367() {
    super(new long[] {-1, 0, 0}, new long[] {1, 1, 2});
  }
}
