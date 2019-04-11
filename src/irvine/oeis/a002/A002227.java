package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.HashSet;

/**
 * A002227 Smallest prime p such that first n primes (p_1=2, <code>...,</code> p_n) are 7th power residues mod p.
 * @author Sean A. Irvine
 */
public class A002227 implements Sequence {

  // There must be a better way...

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(631);
  private int mN = 0;

  private HashSet<Z> septicResidues(final Z q) {
    final HashSet<Z> residues = new HashSet<>();
    for (Z x = Z.ONE; x.compareTo(q) < 0; x = x.add(1)) {
      residues.add(x.modPow(Z.SEVEN, q));
    }
    return residues;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(Z.SEVEN).equals(Z.ONE)) {
        final HashSet<Z> residues = septicResidues(mP);
        Z p = Z.ONE;
        boolean ok = true;
        for (int k = 0; k < mN; ++k) {
          p = mPrime.nextPrime(p);
          if (!residues.contains(p)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mP;
        }
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}
