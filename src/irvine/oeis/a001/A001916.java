package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001916 Primes p such that the congruence 2^x = 5 (mod p) is solvable.
 * @author Sean A. Irvine
 */
public class A001916 extends A001915 {

  @Override
  protected Z residue() {
    return Z.FIVE;
  }
}
