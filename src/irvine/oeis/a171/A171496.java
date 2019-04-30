package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171496 <code>a(n) = 6*a(n-1) - 8*a(n-2)</code> for <code>n &gt; 1; a(0) = 6, a(1) = 28</code>.
 * @author Sean A. Irvine
 */
public class A171496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171496() {
    super(new long[] {-8, 6}, new long[] {6, 28});
  }
}
