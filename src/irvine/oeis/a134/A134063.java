package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134063.
 * @author Sean A. Irvine
 */
public class A134063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134063() {
    super(new long[] {6, -11, 6}, new long[] {1, 1, 2});
  }
}
