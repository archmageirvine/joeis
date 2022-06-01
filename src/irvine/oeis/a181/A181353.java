package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181353 a(n) = 9*a(n-1) + 3*a(n-2); a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A181353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181353() {
    super(new long[] {3, 9}, new long[] {0, 1});
  }
}
