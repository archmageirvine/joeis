package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191010 a(n) = 4^(n+1)*H(2^n)/5 with H(2^n) = n+(6+(-1)^n/4^(n+1))/5 = E(N(2^n)), where X, X(1), X(2),... denote random variables with pdf P(X = 1) = P(X = 4) = 1/5 and P(X = 2) = 3/5, N(x) is the first value of k such that X(1)*X(2)*...*X(k) &gt; x and H(x)= E(N(x)).
 * @author Sean A. Irvine
 */
public class A191010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191010() {
    super(new long[] {-16, -8, 7}, new long[] {1, 7, 41});
  }
}
