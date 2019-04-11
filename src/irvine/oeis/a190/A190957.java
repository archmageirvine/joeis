package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190957 <code>a(n) = 10*a(n-1) + 8*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190957() {
    super(new long[] {8, 10}, new long[] {0, 1});
  }
}
