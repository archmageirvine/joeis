package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135530 a(n) = a(n-1) + 2*a(n-2) - 2*a(n-3), with a(0)=2, a(1)=1.
 * @author Sean A. Irvine
 */
public class A135530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135530() {
    super(new long[] {2, 0}, new long[] {2, 1});
  }
}
