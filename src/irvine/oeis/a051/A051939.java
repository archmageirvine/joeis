package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051939 Truncated triangular pyramid numbers: <code>a(n) =</code> Sum_{k=6..n}(k*(k+1)/2 <code>- 18)</code>.
 * @author Sean A. Irvine
 */
public class A051939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051939() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 13, 31, 58});
  }
}
