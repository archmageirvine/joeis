package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078371 <code>a(n) = (2*n+5)*(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A078371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078371() {
    super(new long[] {1, -3, 3}, new long[] {5, 21, 45});
  }
}
