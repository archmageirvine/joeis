package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054894 <code>a(n+1) = 4*a(n) + 4*a(n-1) - 4*a(n-2) - a(n-3)</code> with <code>a(1)=1, a(2)=2, a(3)=11, a(4)=48</code>.
 * @author Sean A. Irvine
 */
public class A054894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054894() {
    super(new long[] {-1, -4, 4, 4}, new long[] {1, 2, 11, 48});
  }
}
