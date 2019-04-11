package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117080 <code>a(n) = 2a(n-1)+a(n-3)+1</code> with <code>a(1)=1, a(2)=3, a(3)=8</code>.
 * @author Sean A. Irvine
 */
public class A117080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117080() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 8, 18});
  }
}
