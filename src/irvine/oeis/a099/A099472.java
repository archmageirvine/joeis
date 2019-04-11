package irvine.oeis.a099;

import irvine.oeis.FiniteSequence;

/**
 * A099472 Numbers n such that binomial(n,m) cannot be represented as the sum of three squares for any <code>0 &lt;=</code> m <code>&lt;= n</code>.
 * @author Georg Fischer
 */
public class A099472 extends FiniteSequence {

  /** Construct the sequence. */
  public A099472() {
    super(1, 2, 3, 4, 5, 9, 14, 17, 18, 20, 21, 35, 41);
  }
}
