package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002228 Smallest prime p such that first n primes (p_1=2, ..., p_n) are 11th power residues mod p.
 * @author Sean A. Irvine
 */
public class A002228 extends A002225 {

  /** Construct the sequence. */
  public A002228() {
    super(Z.valueOf(11), 331);
  }
}
