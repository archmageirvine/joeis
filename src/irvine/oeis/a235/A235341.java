package irvine.oeis.a235;

import irvine.oeis.FiniteSequence;

/**
 * A235341 Positive integers a such that there exist b, c with <code>1/a + 1/b +</code> 1/c <code>= 1/3</code> and <code>a &gt;= b &gt;=</code> c.
 * @author Georg Fischer
 */
public class A235341 extends FiniteSequence {

  /** Construct the sequence. */
  public A235341() {
    super(9, 12, 15, 18, 20, 21, 24, 28, 30, 36, 42, 45, 48, 60, 84, 120, 156);
  }
}
