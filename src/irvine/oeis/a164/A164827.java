package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164827 Generalized Lucas numbers: <code>a(n) = a(n-1) + 10 a(n-2)</code>; with <code>a(1)=2 a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A164827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164827() {
    super(new long[] {10, 1}, new long[] {2, 1});
  }
}
