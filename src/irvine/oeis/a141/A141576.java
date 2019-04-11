package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141576 An alternating sequence of a difference type: <code>a(0)=-1, a(1)=0, a(2)=1, a(n) = a(n-1) - 2*a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A141576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141576() {
    super(new long[] {1, -2, 1}, new long[] {-1, 0, 1});
  }
}
