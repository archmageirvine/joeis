package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289056 Near 3-perfect numbers of the form 2^a*p^t*q, where <code>a &gt;= 1,</code> t <code>= 1</code> or <code>2,</code> p &lt; q are both primes.
 * @author Georg Fischer
 */
public class A289056 extends FiniteSequence {

  /** Construct the sequence. */
  public A289056() {
    super(180, 240, 360, 1344, 1872, 2688, 3744, 5376, 6048, 6496);
  }
}
