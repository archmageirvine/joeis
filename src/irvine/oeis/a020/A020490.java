package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020490 Numbers n such that <code>phi(n) &lt;= sigma_0(n)</code>.
 * @author Georg Fischer
 */
public class A020490 extends FiniteSequence {

  /** Construct the sequence. */
  public A020490() {
    super(1, 2, 3, 4, 6, 8, 10, 12, 18, 24, 30);
  }
}
