package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154346 a(n) = 12*a(n-1) - 28*a(n-2) for n &gt; 1, with a(0)=1, a(1)=12.
 * @author Sean A. Irvine
 */
public class A154346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154346() {
    super(new long[] {-28, 12}, new long[] {1, 12});
  }
}
