package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259968 a(n) = a(n-1) + a(n-2) + a(n-4), with a(1)=1, a(2)=1, a(3)=3, a(4)=6.
 * @author Sean A. Irvine
 */
public class A259968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259968() {
    super(1, new long[] {1, 0, 1, 1}, new long[] {1, 1, 3, 6});
  }
}
