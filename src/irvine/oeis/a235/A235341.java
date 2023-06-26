package irvine.oeis.a235;

import irvine.oeis.FiniteSequence;

/**
 * A235341 Positive integers a such that there exist b, c with 1/a + 1/b + 1/c = 1/3 and a &gt;= b &gt;= c.
 * @author Georg Fischer
 */
public class A235341 extends FiniteSequence {

  /** Construct the sequence. */
  public A235341() {
    super(1, FINITE, 9, 12, 15, 18, 20, 21, 24, 28, 30, 36, 42, 45, 48, 60, 84, 120, 156);
  }
}
