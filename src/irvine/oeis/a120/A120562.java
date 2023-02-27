package irvine.oeis.a120;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A120562 Sum of binomial coefficients binomial(i+j, i) modulo 2 over all pairs (i,j) of positive integers satisfying 3i+j=n.
 * Recurrence; <code>a(0)=a(1)=1, a(2*n)=a(n) and a(2*n+1)=a(n)+a(n-1)</code>
 * @author Georg Fischer
 */
public class A120562 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A120562() {
    super(0, 1, 1);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n));
    mLambda.add(n -> a(n).add(a(n - 1)));
  }
}
