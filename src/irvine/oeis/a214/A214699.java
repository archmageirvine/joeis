package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214699 <code>a(n) = 3*a(n-2) - a(n-3)</code> with <code>a(0)=0, a(1)=3, a(2)=0</code>.
 * @author Sean A. Irvine
 */
public class A214699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214699() {
    super(new long[] {-1, 3, 0}, new long[] {0, 3, 0});
  }
}
