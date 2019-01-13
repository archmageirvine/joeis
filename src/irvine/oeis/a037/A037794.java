package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037794.
 * @author Sean A. Irvine
 */
public class A037794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037794() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {3, 17, 86, 430, 2153});
  }
}
