package irvine.oeis.a144;

import irvine.oeis.FiniteSequence;

/**
 * A144970 Integers in the sequence of rationals defined by b(1) <code>= 61,</code> b(n) = b(n-1) <code>+ (n+60)/n</code> for <code>n &gt; 1</code>.
 * @author Georg Fischer
 */
public class A144970 extends FiniteSequence {

  /** Construct the sequence. */
  public A144970() {
    super(61, 92, 113, 129, 142, 153);
  }
}
