package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191007 Another renewal type of sequence: Let X, <code>X(1),X(2),..</code>. denote independent random variables with pdf <code>P(X=1) = P(X=2) = P(X=4) = 1/3</code>. Let <code>N(x)</code> denote the first value of k such that <code>X(1)*X(2)...*X(k) &gt;</code> x, and let <code>H(x) = E(N(x))</code>. The sequence <code>a(n)</code> is given by <code>a(n) = 2^(n+1)*H(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A191007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191007() {
    super(new long[] {-4, 0, 3}, new long[] {3, 9, 27});
  }
}
