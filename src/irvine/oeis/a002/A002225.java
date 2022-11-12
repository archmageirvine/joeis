package irvine.oeis.a002;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002225 a(n) is the smallest prime p such that each of the first n primes has three cube roots mod p.
 * @author Sean A. Irvine
 */
public class A002225 extends Sequence1 {

  // There must be a better way...

  private final Fast mPrime = new Fast();
  private final Z mPowerResidue;
  private Z mP;
  private int mN = 0;

  protected A002225(final Z p, final long firstTerm) {
    mPowerResidue = p;
    mP = Z.valueOf(firstTerm - 1);
  }

  /** Construct the sequence. */
  public A002225() {
    this(Z.THREE, 31);
  }

  private HashSet<Z> residues(final Z q) {
    final HashSet<Z> residues = new HashSet<>();
    for (Z x = Z.ONE; x.compareTo(q) < 0; x = x.add(1)) {
      residues.add(x.modPow(mPowerResidue, q));
    }
    return residues;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(mPowerResidue).equals(Z.ONE)) {
        final HashSet<Z> residues = residues(mP);
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
