package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098230 75-gonal numbers: a(n) = n*(73*n-71)/2.
 * @author Sean A. Irvine
 */
public class A098230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098230() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 75});
  }
}
