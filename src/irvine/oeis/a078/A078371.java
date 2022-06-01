package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078371 a(n) = (2*n+5)*(2*n+1).
 * @author Sean A. Irvine
 */
public class A078371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078371() {
    super(new long[] {1, -3, 3}, new long[] {5, 21, 45});
  }
}
