package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285794 <code>a(1)=1, a(2)=2, a(3)=3, a(n) = 3*a(n-3)+2*a(n-2)+a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A285794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285794() {
    super(new long[] {3, 2, 1}, new long[] {1, 2, 3});
  }
}
