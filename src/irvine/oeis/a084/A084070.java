package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084070 <code>a(n) = 38*a(n-1) - a(n-2)</code>, with <code>a(0)=0, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A084070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084070() {
    super(new long[] {-1, 38}, new long[] {0, 6});
  }
}
