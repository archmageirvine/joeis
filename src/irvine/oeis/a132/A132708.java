package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132708.
 * @author Sean A. Irvine
 */
public class A132708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132708() {
    super(new long[] {-1, 0, 0}, new long[] {4, 2, 1});
  }
}
