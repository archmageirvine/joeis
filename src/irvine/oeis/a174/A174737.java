package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174737 <code>a(n) = a(n-1) - a(n-2)</code>, with <code>a(0)=2, a(1)=-1</code>.
 * @author Sean A. Irvine
 */
public class A174737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174737() {
    super(new long[] {-1, 1}, new long[] {2, -1});
  }
}
