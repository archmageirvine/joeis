package irvine.oeis.a138;
// manually 2023-09-05/primepos at 2023-09-05 18:10

import irvine.oeis.a019.A019325;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A138937 Indices k such that A019325(k)=Phi[k](7) is prime, where Phi is a cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A138937 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A138937() {
    super(new A019325(), 0);
    super.next();
  }
}
