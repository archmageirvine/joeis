package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122189 Heptanacci numbers: each term is the sum of the preceding 7 terms, with a(0),...,a(6) = 0,0,0,0,0,0,1.
 * @author Sean A. Irvine
 */
public class A122189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122189() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
