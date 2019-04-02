package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190985 a(n) = 10*a(n-1) - 3*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190985() {
    super(new long[] {-3, 10}, new long[] {0, 1});
  }
}
