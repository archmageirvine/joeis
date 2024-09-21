package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141576 a(0)=-1, a(1)=0, a(2)=1, a(n) = a(n-1) - 2*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A141576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141576() {
    super(new long[] {1, -2, 1}, new long[] {-1, 0, 1});
  }
}
