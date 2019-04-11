package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197189 <code>a(n) = 3*a(n-1) + 5*a(n-2),</code> with <code>a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A197189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197189() {
    super(new long[] {5, 3}, new long[] {1, 2});
  }
}
