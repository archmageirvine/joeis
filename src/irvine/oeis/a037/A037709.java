package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037709.
 * @author Sean A. Irvine
 */
public class A037709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037709() {
    super(new long[] {-4, 5, -5, 5}, new long[] {1, 7, 30, 120});
  }
}
