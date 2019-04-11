package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129959 A129957(n) <code>- n*(n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A129959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129959() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 1, 8, 24, 59});
  }
}
