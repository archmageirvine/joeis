package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098182.
 * @author Sean A. Irvine
 */
public class A098182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098182() {
    super(new long[] {1, -1, 3}, new long[] {1, 1, 3});
  }
}
