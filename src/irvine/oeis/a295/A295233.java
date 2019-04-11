package irvine.oeis.a295;

import irvine.oeis.FiniteSequence;

/**
 * A295233 Perfect n-th powers y^n <code>(n &gt;= 3)</code> of the form <code>x^2 + 2^a * 5^b (x, a, b &gt;= 1,</code> gcd(x, y) <code>= 1)</code>.
 * @author Georg Fischer
 */
public class A295233 extends FiniteSequence {

  /** Construct the sequence. */
  public A295233() {
    super(81, 729, 1331, 6561, 68921, 161051, 2146689, 315821241L);
  }
}
