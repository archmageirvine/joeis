package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094864 a(0)=1, a(1)=2, a(2)=6, a(3)=18; for n&gt;=4, a(n) = 6*a(n-1)-11*a(n-2)+6*a(n-3)-a(n-4).
 * @author Sean A. Irvine
 */
public class A094864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094864() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 2, 6, 18});
  }
}
