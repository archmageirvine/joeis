package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202206 <code>a(n) = 3*a(n-1)+3*a(n-2)</code> with <code>a(0)=1</code> and <code>a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A202206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202206() {
    super(new long[] {3, 3}, new long[] {1, 2});
  }
}
