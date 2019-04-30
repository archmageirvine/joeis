package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135541 <code>a(n) = 2*a(n-1) - a(n-2) + 2*a(n-3)</code>, with <code>a(0) = 2, a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A135541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135541() {
    super(new long[] {2, -1, 2}, new long[] {0, 2, 7});
  }
}
