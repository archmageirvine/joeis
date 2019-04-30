package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122946 <code>a(0)=a(1)=0, a(2)=a(3)=2</code>, for <code>n&gt;=3 a(n)=a(n-1)+4*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A122946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122946() {
    super(new long[] {4, 0, 1}, new long[] {0, 0, 2});
  }
}
