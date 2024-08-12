package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049856 a(n) = (Sum{k=0..n-1} a(k)) - a(n-3), with a(0)=0, a(1)=0, a(2)=1.
 * @author Sean A. Irvine
 */
public class A049856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049856() {
    super(new long[] {1, -1, 0, 2}, new long[] {0, 0, 1, 1});
  }
}
