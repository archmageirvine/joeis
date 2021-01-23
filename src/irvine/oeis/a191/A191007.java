package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191007 Another renewal type of sequence: Let X, X(1),X(2),... denote independent random variables with pdf P(X=1) = P(X=2) = P(X=4) = 1/3. Let N(x) denote the first value of k such that X(1)*X(2)...*X(k) &gt; x, and let H(x) = E(N(x)). The sequence a(n) is given by a(n) = 2^(n+1)*H(2^n).
 * @author Sean A. Irvine
 */
public class A191007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191007() {
    super(new long[] {-4, 0, 3}, new long[] {3, 9, 27});
  }
}
