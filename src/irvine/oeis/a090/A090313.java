package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090313 <code>a(n) = 22a(n-1) + a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 22</code>.
 * @author Sean A. Irvine
 */
public class A090313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090313() {
    super(new long[] {1, 22}, new long[] {2, 22});
  }
}
