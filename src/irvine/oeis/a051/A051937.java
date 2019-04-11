package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051937 Truncated triangular pyramid numbers: <code>a(n) =</code> Sum_{k=4..n} <code>k*(k+1)/2-9</code>.
 * @author Sean A. Irvine
 */
public class A051937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051937() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 19, 38});
  }
}
