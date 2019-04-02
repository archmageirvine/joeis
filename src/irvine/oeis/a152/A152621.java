package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152621 a(n)=8*a(n-1)-6*a(n-2), n&gt;1 ; a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A152621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152621() {
    super(new long[] {-6, 8}, new long[] {1, 2});
  }
}
