package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190869 <code>a(n) = 10*a(n-1) - 2*a(n-2), a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190869() {
    super(new long[] {-2, 10}, new long[] {0, 1});
  }
}
