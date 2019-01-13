package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098657.
 * @author Sean A. Irvine
 */
public class A098657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098657() {
    super(new long[] {-16, 8, 2}, new long[] {1, 1, 6});
  }
}
