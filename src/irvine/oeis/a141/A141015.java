package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141015 <code>a(0) = 0, a(1) = 1, a(2) = 2;</code> for <code>n &gt; 2, a(n) = a(n-1) + 2*a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A141015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141015() {
    super(new long[] {1, 2, 1}, new long[] {0, 1, 2});
  }
}
