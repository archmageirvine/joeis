package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037692.
 * @author Sean A. Irvine
 */
public class A037692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037692() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 10, 80, 643, 5145});
  }
}
