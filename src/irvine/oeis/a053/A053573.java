package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053573 <code>a(n) = 5*a(n-1) + 14*a(n-2), a(0)=1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A053573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053573() {
    super(new long[] {14, 5}, new long[] {1, 5});
  }
}
