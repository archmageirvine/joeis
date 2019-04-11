package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290124 <code>a(n) = a(n-1) + 12*a(n-2)</code> with <code>a(1) = 1</code> and <code>a(2) = 2</code>.
 * @author Sean A. Irvine
 */
public class A290124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290124() {
    super(new long[] {12, 1}, new long[] {1, 2});
  }
}
