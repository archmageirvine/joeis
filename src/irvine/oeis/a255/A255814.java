package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255814 Numbers of words on {0,1,2,3,4,} having no isolated zeros.
 * @author Sean A. Irvine
 */
public class A255814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255814() {
    super(new long[] {4, -4, 5}, new long[] {1, 4, 17});
  }
}
