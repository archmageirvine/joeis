package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152163 a(n) = a(n-1)+a(n-2), n&gt;1 ; a(0)=1, a(1)=-1.
 * @author Sean A. Irvine
 */
public class A152163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152163() {
    super(new long[] {1, 1}, new long[] {1, -1});
  }
}
