package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182467 <code>a(n) = 3a(n-1) - 2a(n-2)</code> with <code>a(0)=36</code> and <code>a(1)=90</code>.
 * @author Sean A. Irvine
 */
public class A182467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182467() {
    super(new long[] {-2, 3}, new long[] {36, 90});
  }
}
