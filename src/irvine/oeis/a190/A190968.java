package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190968 a(n) = 4*a(n-1) - 10*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190968() {
    super(new long[] {-10, 4}, new long[] {0, 1});
  }
}
