package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270797 <code>a(n) = J(n)</code> if n odd, or <code>4*J(n)</code> if n even, where J = Jacobsthal numbers <code>A001045</code>.
 * @author Sean A. Irvine
 */
public class A270797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270797() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 4, 3});
  }
}
