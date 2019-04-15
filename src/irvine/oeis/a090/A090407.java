package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090407 <code>a(n) =</code> Sum_{k <code>= 0..n} C(4*n + 1, 4*k)</code>.
 * @author Sean A. Irvine
 */
public class A090407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090407() {
    super(new long[] {64, 12}, new long[] {1, 6});
  }
}
