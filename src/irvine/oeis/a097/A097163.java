package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097163.
 * @author Sean A. Irvine
 */
public class A097163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097163() {
    super(new long[] {-4, 4, 1}, new long[] {1, 2, 5});
  }
}
