package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014101 a(n) = a(n-1) + a(n-4), starting 1,1,1,3.
 * @author Sean A. Irvine
 */
public class A014101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014101() {
    super(new long[] {1, 0, 0, 1}, new long[] {1, 1, 1, 3});
  }
}
