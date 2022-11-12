package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002227 Smallest prime p such that first n primes (p_1=2, ..., p_n) are 7th power residues mod p.
 * @author Sean A. Irvine
 */
public class A002227 extends A002225 {

  /** Construct the sequence. */
  public A002227() {
    super(Z.SEVEN, 631);
  }
}
