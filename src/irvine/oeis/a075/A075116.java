package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075116.
 * @author Sean A. Irvine
 */
public class A075116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075116() {
    super(new long[] {-1, 6, -8, 5}, new long[] {4, 5, 9, 23});
  }
}
