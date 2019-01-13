package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111566.
 * @author Sean A. Irvine
 */
public class A111566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111566() {
    super(new long[] {-2, 4}, new long[] {1, 6});
  }
}
