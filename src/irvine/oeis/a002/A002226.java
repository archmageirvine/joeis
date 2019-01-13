package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.HashSet;

/**
 * A002226.
 * @author Sean A. Irvine
 */
public class A002226 implements Sequence {

  // There must be a better way...

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(151);
  private int mN = 0;

  private HashSet<Z> quinticResidues(final Z q) {
    final HashSet<Z> residues = new HashSet<>();
    for (Z x = Z.ONE; x.compareTo(q) < 0; x = x.add(1)) {
      residues.add(x.modPow(Z.FIVE, q));
    }
    return residues;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(Z.FIVE).equals(Z.ONE)) {
        final HashSet<Z> residues = quinticResidues(mP);
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
