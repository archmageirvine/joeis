package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126354 a(n) = 6*a(n-2) - a(n-4) for n &gt; 4, with a(1)=1, a(2)=0, a(3)=3, a(4)=2.
 * @author Sean A. Irvine
 */
public class A126354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126354() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 0, 3, 2});
  }
}
