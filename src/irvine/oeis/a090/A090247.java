package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090247 <code>a(n) = 26*a(n-1) - a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 26</code>.
 * @author Sean A. Irvine
 */
public class A090247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090247() {
    super(new long[] {-1, 26}, new long[] {2, 26});
  }
}
