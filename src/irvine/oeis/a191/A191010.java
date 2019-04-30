package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191010 <code>a(n) = 4^(n+1)*H(2^n)/5</code> with <code>H(2^n) = n+(6+(-1)^n/4^(n+1))/5 = E(N(2^n))</code>, where X, <code>X(1), X(2),.</code>.. denote random variables with pdf P(X <code>= 1) =</code> P(X <code>= 4) = 1/5</code> and P(X <code>= 2) = 3/5, N(x)</code> is the first value of k such that <code>X(1)*X(2)*...*X(k) &gt; x</code> and <code>H(x)= E(N(x))</code>.
 * @author Sean A. Irvine
 */
public class A191010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191010() {
    super(new long[] {-16, -8, 7}, new long[] {1, 7, 41});
  }
}
