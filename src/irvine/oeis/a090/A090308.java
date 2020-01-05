package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090308 <code>a(n) = 19*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 19</code>.
 * @author Sean A. Irvine
 */
public class A090308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090308() {
    super(new long[] {1, 19}, new long[] {2, 19});
  }
}
