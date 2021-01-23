package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190989 a(n) = 10*a(n-1) - 7*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190989() {
    super(new long[] {-7, 10}, new long[] {0, 1});
  }
}
