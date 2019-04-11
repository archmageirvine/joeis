package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255680 <code>a(n) = n*(n mod 3)*(n mod 5)</code>.
 * @author Sean A. Irvine
 */
public class A255680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255680() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 8, 0, 16, 0, 0, 14, 48, 0, 0, 22, 0, 39, 112, 0, 16, 68, 0, 76, 0, 0, 44, 138, 0, 0, 52, 0, 84, 232});
  }
}
