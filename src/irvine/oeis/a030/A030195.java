package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030195 a(n) = 3*a(n-1) + 3*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A030195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030195() {
    super(new long[] {3, 3}, new long[] {0, 1});
  }
}
