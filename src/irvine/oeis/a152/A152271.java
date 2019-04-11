package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152271 <code>a(n)=1</code> for even n and <code>(n+1)/2</code> for odd n.
 * @author Sean A. Irvine
 */
public class A152271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152271() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 1, 2});
  }
}
