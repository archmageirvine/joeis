package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.HashSet;

/**
 * A002228.
 * @author Sean A. Irvine
 */
public class A002228 implements Sequence {

  // There must be a better way...

  private static final Z ELEVEN = Z.valueOf(11);
  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(331);
  private int mN = 0;

  private HashSet<Z> septicResidues(final Z q) {
    final HashSet<Z> residues = new HashSet<>();
    for (Z x = Z.ONE; x.compareTo(q) < 0; x = x.add(1)) {
      residues.add(x.modPow(ELEVEN, q));
    }
    return residues;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(ELEVEN).equals(Z.ONE)) {
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
