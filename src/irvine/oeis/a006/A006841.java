package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006841 Permutation arrays of period n.
 * Compute number of different patterns that arise from permutations on a torus.
 *
 * If you have a permutation <code>p_i</code>, i.e. an element of the symmetric group <code>S_n</code>,
 * you may visualize it by drawing a dot at all <code>(k, p_i(k))</code> in a coordinate system
 * or placing a chess pawn at field <code>(k, p_i(k))</code> on a n by n chess board, for all 1&lt;=k&lt;=n.
 * Different permutations will lead to different patterns.
 *
 * The patterns may similar in the following sense: they may be rotations,
 * reflections of torus shifts of other patterns. Torus shift means that you shift
 * end around, i.e. if you arrive at n you start with 1 again.
 *
 * This program computes the number of patterns which are different also
 * under these operations.
 *
 * Counting that number is equivalent to counting classes of sequential binary
 * arrays for the sequence 000001 ((n-1) copies 0, one copy 1). That problem is
 * discussed in the paper
 *
 * Anne Penfold Street and Robert Day
 * Sequential binary arrays II: Further results on the  square grid,
 * pp. 392-418 of Combinatorial Mathematics IX. Proc. Ninth Australian Conference
 * (Brisbane, August 1981).
 * Ed. E.J. Billington, S.Oates-Williams and A.P.Street.
 * Lecture Notes Math., 952. Springer-Verlag, 1982.
 *
 * The program uses the formulae that are given in that  paper. The program showed,
 * however, that we need two correction terms for n = 1 and n = 2.
 *
 * @author Matthias Engelhardt
 * @author Sean A. Irvine
 */
public class A006841 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private int getH(final int rmd4) {
    switch (rmd4) {
      case 0:
        return mN / 2;
      case 1:
        return (mN - 1) / 2;
      case 2:
        return mN / 2;
      case 3:
      default:
        return (mN - 1) / 2;
    }
  }

  @Override
  public Z next() {
    ++mN;

    final Z[] nrCoset = new Z[5];
    final int idxN = 0;
    final int idxNw2 = 1;
    final int idxNw = 2;
    final int idxNx = 3;
    final int idxNwx = 4;

    // Program follows the cases in the paper (Page 396).
    final int rmd4 = mN % 4;
    final int k = mN / 4;
    final int h = getH(rmd4);
    final Z bigN = Z.valueOf(mN);

    // First all cosets without reflection
    // Compute nrCoset [idxN], i.e. subgroup itself.
    Z wk1 = Z.ZERO;
    for (int d = 1; d <= mN; d++) {
      if (mN % d == 0) {
        final int i = mN / d;
        final Z t = Z.valueOf(Euler.phiAsLong(i)).square().multiply(Z.valueOf(i).pow(d)).multiply(mF.factorial(d));
        wk1 = wk1.add(t);
      }
    }
    nrCoset[idxN] = wk1;

    // Compute nrCoset [idxNw2], i.e. 180 degrees rotation.
    if (rmd4 == 0 || rmd4 == 2) {
      nrCoset[idxNw2] = mF.factorial(h + 1).multiply(h).shiftLeft(h);
    } else {
      nrCoset[idxNw2] = Z.TWO.multiply(h).add(Z.ONE).square().multiply(mF.factorial(h)).shiftLeft(h);
    }

    // Compute nrCoset [idxNw],   i.e. 90 degrees rotation (or 270 degrees).
    // For that, compute the product first
    Z product = Z.ONE;
    for (int l = 1; l <= k; l++) {
      product = product.multiply(2L * l - 1);
    }
    switch (rmd4) {
      case 0:
        nrCoset[idxNw] = product.multiply(k * (long) k).shiftLeft(k + 3);
        break;
      case 1:
        nrCoset[idxNw] = product.multiply(mN * (long) mN).shiftLeft(k);
        break;
      case 2:
        nrCoset[idxNw] = product.multiply(Z.valueOf(2 * k + 1).square()).shiftLeft(k + 2);
        break;
      case 3:
      default:
        nrCoset[idxNw] = Z.ZERO;
        break;
    }

    // Now cosets with reflection (x means reflection)
    // Compute nrCoset [idxNx], i.e. only reflection.
    // This part is the most complex part (complex not in mathematical sense)
    wk1 = Z.ZERO;
    for (int d = 1; d <= mN; d++) {
      if (mN % d == 0) {   // Take only factors of n
        final Z numerator = mF.factorial(d).multiply(mN).multiply(Euler.phiAsLong(mN / d));
        if (((mN / d) & 1) == 1) {
          Z subSum = Z.ZERO;
          for (int l = 0; 2 * l <= d; l++) {
            final Z denominator = Z.valueOf(2L * d).pow(l)
              .multiply(mF.factorial(l))
              .multiply(mF.factorial(d - 2 * l));
            final Z wk3 = numerator.multiply(bigN.pow(l));
            final Z[] divisionResult = wk3.divideAndRemainder(denominator);
            if (!divisionResult[1].isZero()) {
              throw new RuntimeException("Error: division results in a mRemainder");
            }
            subSum = subSum.add(divisionResult[0]);
          }
          wk1 = wk1.add(subSum);
        } else {
          if (rmd4 == 0) {
            if (d % 2 == 0) {
              final int h2 = d / 2;
              final Z denominator = Z.valueOf(2L * d).pow(h2).multiply(mF.factorial(h2));
              final Z[] divisionResult = numerator.multiply(bigN.pow(h2)).divideAndRemainder(denominator);
              if (!divisionResult[1].isZero()) {
                throw new RuntimeException("Error: division results in a mRemainder");
              }
              wk1 = wk1.add(divisionResult[0]);
            }     // even d
          }      // n divisible by 4
        }       // even n / d
      }        // d factor of n
    }         // all factors d of n
    nrCoset[idxNx] = wk1;

    // No nrCoset [idxNw2x],    i.e. reflection plus 180 it is the same as reflection only!
    // Compute nrCoset [idxNwx],   i.e. reflection plus 90 rotation.
    if (rmd4 == 0 || rmd4 == 2) {
      nrCoset[idxNwx] = mF.factorial(h).multiply(h).shiftLeft(h);
    } else {
      nrCoset[idxNwx] = Z.ZERO;
    }

    // Corrections for small values:
    if (mN == 1) {
      nrCoset[idxNx] = Z.ONE;
      nrCoset[idxNwx] = Z.ONE;
    } else if (mN == 2) {
      nrCoset[idxNx] = Z.FOUR;
      nrCoset[idxNwx] = Z.FOUR;
    }

    // Now take the sum; for that, I sum up first the three parts that occur twice.
    return nrCoset[idxNw]
      .add(nrCoset[idxNx])
      .add(nrCoset[idxNwx])
      .multiply2()
      .add(nrCoset[idxN])
      .add(nrCoset[idxNw2])
      .divide(8L * mN * mN);
  }
}

