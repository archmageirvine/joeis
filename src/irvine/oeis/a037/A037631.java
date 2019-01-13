package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037631.
 * @author Sean A. Irvine
 */
public class A037631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037631() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 23, 230, 2302});
  }
}
