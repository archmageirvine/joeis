package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082209 <code>a(1) = 1, a(n) =</code> smallest number such that the concatenation of <code>a(n-1)</code> and <code>a(n)</code> is a square.
 * @author Sean A. Irvine
 */
public class A082209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082209() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 6, 4, 9, 61, 504});
  }
}
