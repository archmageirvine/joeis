package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051943 Truncated triangular pyramid numbers: <code>a(n) =</code> Sum_{k=9..n} <code>(k*(k+1)/2 - 45)</code>.
 * @author Sean A. Irvine
 */
public class A051943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051943() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 31, 64});
  }
}
