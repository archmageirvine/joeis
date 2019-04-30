package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072263 <code>a(n) = 3*a(n-1) + 5*a(n-2)</code>, with <code>a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A072263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072263() {
    super(new long[] {5, 3}, new long[] {2, 3});
  }
}
