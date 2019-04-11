package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081194 <code>a(n) = 8*a(n-1) -15*a(n-2), a(0)=1, a(1)=16</code>.
 * @author Sean A. Irvine
 */
public class A081194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081194() {
    super(new long[] {-15, 8}, new long[] {1, 16});
  }
}
