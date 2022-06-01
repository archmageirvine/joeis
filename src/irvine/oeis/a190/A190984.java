package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190984 a(n) = 9*a(n-1) - 7*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190984() {
    super(new long[] {-7, 9}, new long[] {0, 1});
  }
}
