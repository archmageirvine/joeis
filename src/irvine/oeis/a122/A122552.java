package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122552 <code>a(0)=a(1)=a(2)=1, a(n) = a(n-1) + a(n-2) + 2*a(n-3)</code> for <code>n &gt; 2</code>.
 * @author Sean A. Irvine
 */
public class A122552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122552() {
    super(new long[] {2, 1, 1}, new long[] {1, 1, 1});
  }
}
