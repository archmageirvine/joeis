package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135530 <code>a(n) = a(n-1) + 2*a(n-2) - 2*a(n-3)</code>, with <code>a(0)=2, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A135530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135530() {
    super(new long[] {2, 0}, new long[] {2, 1});
  }
}
