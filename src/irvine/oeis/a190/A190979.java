package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190979 a(n) = 9*a(n-1) - 2*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190979() {
    super(new long[] {-2, 9}, new long[] {0, 1});
  }
}
