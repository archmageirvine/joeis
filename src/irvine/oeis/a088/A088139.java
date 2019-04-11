package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088139 <code>a(n) = 2*a(n-1) - 6*a(n-2), a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A088139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088139() {
    super(new long[] {-6, 2}, new long[] {0, 1});
  }
}
