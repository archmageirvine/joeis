package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132584 <code>a(0)=0, a(1)=4</code>; for <code>n &gt; 1, a(n) = 18*a(n-1) - a(n-2) + 8</code>.
 * @author Sean A. Irvine
 */
public class A132584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132584() {
    super(new long[] {1, -19, 19}, new long[] {0, 4, 80});
  }
}
