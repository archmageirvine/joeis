package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141385 a(n) = 7*a(n-1)-9*a(n-2)+a(n-3) with a(0)=3, a(1)=7, a(2)=31.
 * @author Sean A. Irvine
 */
public class A141385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141385() {
    super(new long[] {1, -9, 7}, new long[] {3, 7, 31});
  }
}
