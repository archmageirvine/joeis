package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083881 <code>a(n) = 6*a(n-1) - 6*a(n-2)</code>, with <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A083881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083881() {
    super(new long[] {-6, 6}, new long[] {1, 3});
  }
}
