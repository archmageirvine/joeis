package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085325 a(n) is the least number m such that the minimal exponent for which reverse(m^n) = prime holds is n. Thus reverse(m^k) is composite for k = 1, .., n-1.
 * @author Sean A. Irvine
 */
public class A085325 extends InverseSequence {

  /** Construct the sequence. */
  public A085325() {
    super(1, new A085324());
  }
}
