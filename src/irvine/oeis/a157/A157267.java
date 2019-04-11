package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157267 <code>a(n) = 10368*n^2 - 4896*n + 577</code>.
 * @author Sean A. Irvine
 */
public class A157267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157267() {
    super(new long[] {1, -3, 3}, new long[] {6049, 32257, 79201});
  }
}
