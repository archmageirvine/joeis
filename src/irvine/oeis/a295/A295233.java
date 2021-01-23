package irvine.oeis.a295;

import irvine.oeis.FiniteSequence;

/**
 * A295233 Perfect n-th powers y^n (n &gt;= 3) of the form x^2 + 2^a * 5^b (x, a, b &gt;= 1, gcd(x, y) = 1).
 * @author Georg Fischer
 */
public class A295233 extends FiniteSequence {

  /** Construct the sequence. */
  public A295233() {
    super(81, 729, 1331, 6561, 68921, 161051, 2146689, 315821241L);
  }
}
