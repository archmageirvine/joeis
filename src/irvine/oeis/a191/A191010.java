package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191010 <code>a(n) =</code> 4^(n+1)*H(2^n)/5 with H(2^n) <code>= n+(6+(-1)^n/4^(n+1))/5 =</code> E(N(2^n)), where X, X(1), X(2),... denote random variables with pdf P(X <code>= 1) =</code> P(X <code>= 4) = 1/5</code> and P(X <code>= 2) = 3/5,</code> N(x) is the first value of k such that X(1)*X(2)*...*X(k) <code>&gt; x</code> and H(x)= E(N(x)).
 * @author Sean A. Irvine
 */
public class A191010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191010() {
    super(new long[] {-16, -8, 7}, new long[] {1, 7, 41});
  }
}
