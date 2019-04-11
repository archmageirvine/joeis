package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263231 <code>a(n) = n*(25*n - 39)/2</code>.
 * @author Sean A. Irvine
 */
public class A263231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263231() {
    super(new long[] {1, -3, 3}, new long[] {0, -7, 11});
  }
}
