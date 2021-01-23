package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089817 a(n) = 5*a(n-1) - a(n-2) + 1 with a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A089817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089817() {
    super(new long[] {1, -6, 6}, new long[] {1, 6, 30});
  }
}
