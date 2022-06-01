package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276308 a(n) = (a(n-1)+1)*(a(n-3)+1)/a(n-4) for n &gt; 3, a(0) = a(1) = a(2) = a(3) = 1.
 * @author Sean A. Irvine
 */
public class A276308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276308() {
    super(new long[] {1, 0, 0, -35, 0, 0, 35, 0, 0}, new long[] {1, 1, 1, 1, 4, 10, 22, 115, 319});
  }
}
