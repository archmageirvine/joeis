package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079398 a(0)=0, a(1)=1, a(2)=1, a(3)=1, a(n) = a(n-3) + a(n-4) for n &gt; 3.
 * @author Sean A. Irvine
 */
public class A079398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079398() {
    super(new long[] {1, 1, 0, 0}, new long[] {0, 1, 1, 1});
  }
}
