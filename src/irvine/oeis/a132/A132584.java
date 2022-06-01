package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132584 a(0)=0, a(1)=4; for n &gt; 1, a(n) = 18*a(n-1) - a(n-2) + 8.
 * @author Sean A. Irvine
 */
public class A132584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132584() {
    super(new long[] {1, -19, 19}, new long[] {0, 4, 80});
  }
}
