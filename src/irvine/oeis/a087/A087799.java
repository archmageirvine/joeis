package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087799 <code>a(n) = 10*a(n-1) - a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A087799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087799() {
    super(new long[] {-1, 10}, new long[] {2, 10});
  }
}
