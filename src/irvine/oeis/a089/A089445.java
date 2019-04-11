package irvine.oeis.a089;

import irvine.oeis.FiniteSequence;

/**
 * A089445 Smallest 7-tuple of consecutive primes such that <code>a(n)+a(n+1)+a(n+2)+a(n+3)+a(n+4), n=1...3,</code> are again consecutive primes.
 * @author Georg Fischer
 */
public class A089445 extends FiniteSequence {

  /** Construct the sequence. */
  public A089445() {
    super(2255507, 2255549, 2255551, 2255567, 2255569, 2255573, 2255581);
  }
}
