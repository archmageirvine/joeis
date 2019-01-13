package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037772.
 * @author Sean A. Irvine
 */
public class A037772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037772() {
    super(new long[] {-4, 5, -5, 5}, new long[] {3, 13, 52, 210});
  }
}
