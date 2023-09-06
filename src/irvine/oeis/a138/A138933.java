package irvine.oeis.a138;
// manually 2023-09-05/primepos at 2023-09-05 18:10

import irvine.oeis.a019.A019321;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A138933 Indices k such that A019321(k)=Phi[k](3) is prime, where Phi is a cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A138933 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A138933() {
    super(new A019321(), 0);
    super.next();
  }
}
