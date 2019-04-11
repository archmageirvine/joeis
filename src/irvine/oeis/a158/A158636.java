package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158636 <code>a(n) = 576*n^2 - 24</code>.
 * @author Sean A. Irvine
 */
public class A158636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158636() {
    super(new long[] {1, -3, 3}, new long[] {552, 2280, 5160});
  }
}
