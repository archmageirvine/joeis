package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191008 Another renewal type of sequence. Let X, <code>X(1), X(2),..</code>. denote random variables with pdf <code>P(X = 1) = P(X = 4 ) = 1/4</code> and <code>P(X = 2) = 1/2</code>. Let <code>N(x)</code> denote the first value of k such that <code>X(1)*X(2)*...*X(k) &gt; x</code> and let <code>H(x)= E(N(x))</code>. The sequence is given by <code>a(n) = 3^(n+1)*H(2^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A191008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191008() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 22});
  }
}
