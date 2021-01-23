package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002224 Smallest prime p of form p = 8k+1 such that first n primes (p_1=2, ..., p_n) are quadratic residues mod p.
 * @author Sean A. Irvine
 */
public class A002224 extends A002223 {

  @Override
  protected Z residueClass() {
    return Z.ONE;
  }
}
