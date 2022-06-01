package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128786 n^2*7^n.
 * @author Sean A. Irvine
 */
public class A128786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128786() {
    super(new long[] {343, -147, 21}, new long[] {0, 7, 196});
  }
}
