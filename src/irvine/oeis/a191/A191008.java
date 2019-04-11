package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191008 Another renewal type of sequence. Let X, X(1), X(2),... denote random variables with pdf P(X <code>= 1) =</code> P(X <code>= 4 ) = 1/4</code> and P(X <code>= 2) = 1/2</code>. Let N(x) denote the first value of k such that X(1)*X(2)*...*X(k) <code>&gt; x</code> and let H(x)= E(N(x)). The sequence is given by <code>a(n) =</code> 3^(n+1)*H(2^n)/4.
 * @author Sean A. Irvine
 */
public class A191008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191008() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 22});
  }
}
