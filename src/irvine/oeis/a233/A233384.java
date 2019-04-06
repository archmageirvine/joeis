package irvine.oeis.a233;

import irvine.oeis.FiniteSequence;

/**
 * A233384 Positive integer solutions x &lt;= y &lt;= z to the equation xyz = x+y+z+2.
 * @author Georg Fischer
 */
public class A233384 extends FiniteSequence {

  /** Construct the sequence. */
  public A233384() {
    super(1, 2, 5, 1, 3, 3, 2, 2, 2);
  }
}
