package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002226 Smallest prime p such that first n primes (p_1=2, ..., p_n) are quintic residues mod p.
 * @author Sean A. Irvine
 */
public class A002226 extends A002225 {

  /** Construct the sequence. */
  public A002226() {
    super(Z.FIVE, 151);
  }
}
