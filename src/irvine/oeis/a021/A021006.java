package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021006 Pisot sequence <code>P(4,11), a(0)=4, a(1)=11, a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>. Evidently satisfies <code>a(n) = 2*a(n-1)+2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A021006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021006() {
    super(new long[] {2, 2}, new long[] {4, 11});
  }
}
