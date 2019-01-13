package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053088.
 * @author Sean A. Irvine
 */
public class A053088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053088() {
    super(new long[] {2, 3, 0}, new long[] {1, 0, 3});
  }
}
