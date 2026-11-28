package irvine.math.group;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Exact obstructions to rational similarity of positive invariant forms.
 * @author Gregory Morse
 */
final class RationalInvariantForms {

  private static final class Unit {
    private final int mValuation;
    private final int mResidue;

    private Unit(final int valuation, final int residue) {
      mValuation = valuation;
      mResidue = residue;
    }
  }

  private final Q[] mDiagonal;
  private final Q mDeterminant;
  private final int[] mPrimes;
  private final int[] mHasse;
  private final boolean[] mDiscriminantSquare;

  RationalInvariantForms(final Q[] diagonal, final int[] primes) {
    if (diagonal.length == 0) {
      throw new IllegalArgumentException("Expected a nonempty invariant form");
    }
    mDiagonal = diagonal.clone();
    mPrimes = primes.clone();
    Q determinant = Q.ONE;
    for (final Q a : mDiagonal) {
      if (a.signum() <= 0) {
        throw new IllegalArgumentException("Expected a positive diagonal form");
      }
      determinant = determinant.multiply(a);
    }
    mDeterminant = determinant;
    mHasse = new int[primes.length];
    mDiscriminantSquare = new boolean[primes.length];
    final Q discriminant = (diagonal.length & 3) == 2 ? determinant.negate() : determinant;
    for (int i = 0; i < primes.length; ++i) {
      final int p = primes[i];
      mHasse[i] = hasse(Q.ONE, p);
      mDiscriminantSquare[i] = localSquare(unit(discriminant, p), p);
    }
  }

  Q determinant() {
    return mDeterminant;
  }

  private static Unit unit(final Q a, final int p) {
    Z numerator = a.num();
    Z denominator = a.den();
    if (p == 2) {
      final int u = numerator.getLowestSetBit();
      final int v = denominator.getLowestSetBit();
      numerator = numerator.shiftRight(u);
      denominator = denominator.shiftRight(v);
      // Odd residues are their own inverses modulo eight.
      return new Unit(u - v, (int) numerator.multiply(denominator).mod(8));
    }
    final Z modulus = Z.valueOf(p);
    int valuation = 0;
    while (numerator.mod(modulus).isZero()) {
      numerator = numerator.divide(p);
      ++valuation;
    }
    while (denominator.mod(modulus).isZero()) {
      denominator = denominator.divide(p);
      --valuation;
    }
    return new Unit(valuation,
      numerator.mod(modulus).multiply(denominator.mod(modulus).modPow(p - 2L, modulus)).mod(modulus).intValueExact());
  }

  private static int nonresidue(final int a, final int p) {
    return Z.valueOf(a).modPow((p - 1) / 2L, p).isOne() ? 0 : 1;
  }

  private static boolean localSquare(final Unit unit, final int p) {
    return (unit.mValuation & 1) == 0 && (p == 2 ? unit.mResidue == 1 : nonresidue(unit.mResidue, p) == 0);
  }

  private static int hilbert(final Unit a, final Unit b, final int p) {
    final int e = a.mValuation;
    final int f = b.mValuation;
    final int u = a.mResidue;
    final int v = b.mResidue;
    if (p == 2) {
      return ((u - 1) * (v - 1) / 4 + e * ((v * v - 1) / 8) + f * ((u * u - 1) / 8)) & 1;
    }
    return (e * f * ((p - 1) / 2) + f * nonresidue(u, p) + e * nonresidue(v, p)) & 1;
  }

  private int hasse(final Q scale, final int p) {
    final Unit[] units = new Unit[mDiagonal.length];
    int result = 0;
    for (int i = 0; i < units.length; ++i) {
      units[i] = unit(mDiagonal[i].multiply(scale), p);
      for (int j = 0; j < i; ++j) {
        result ^= hilbert(units[i], units[j], p);
      }
    }
    return result;
  }

  /**
   * A nonzero result is an obstruction; zero makes no assertion of equivalence.
   * @param target other form, tested at the same primes
   * @return minus one for determinant square class, or the prime of a local obstruction
   */
  int obstruction(final RationalInvariantForms target) {
    final int dimension = mDiagonal.length;
    if (dimension != target.mDiagonal.length || !Arrays.equals(mPrimes, target.mPrimes)) {
      throw new IllegalArgumentException("Incompatible invariant forms");
    }
    final Q ratio = mDeterminant.divide(target.mDeterminant);
    if ((dimension & 1) == 0) {
      if (!ratio.num().isSquare() || !ratio.den().isSquare()) {
        return -1;
      }
      // A scalar can only alter the Hasse invariant by its Hilbert
      // symbol with the signed discriminant in even dimension.
      for (int i = 0; i < mPrimes.length; ++i) {
        if (target.mDiscriminantSquare[i] && mHasse[i] != target.mHasse[i]) {
          return mPrimes[i];
        }
      }
    } else {
      // The ratio of determinants determines the scalar square class.
      for (int i = 0; i < mPrimes.length; ++i) {
        if (mHasse[i] != target.hasse(ratio, mPrimes[i])) {
          return mPrimes[i];
        }
      }
    }
    return 0;
  }
}
