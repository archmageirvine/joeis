package irvine.oeis.a055;

import irvine.oeis.PrependSequence;
import irvine.oeis.a225.A225035;

/**
 * A055387 Primes such that at least one nontrivial permutation of its digits is prime, together with the repdigit primes 2, 3, 5, 7, 11, 1111111111111111111, ... (A116692).
 * @author Sean A. Irvine
 */
public class A055387 extends PrependSequence {

  /** Construct the sequence. */
  public A055387() {
    super(new A225035(), 2, 3, 5, 7, 11);
  }
}
