package irvine.oeis.a309;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A309244 Triangle of number of nonsingular binary matrices by number of ones.
 * @author Gregory Morse
 */
public class A309244 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mK = 0;
  private Polynomial<Z> mRow = RING.zero();

  private static void subspaces(final int pivots, final int remaining, final int all,
                                final int[] vectors, final int size, final int n, final Z weight,
                                final Map<Polynomial<Z>, Z> histogram) {
    if (remaining == 0) {
      final int[] counts = new int[n + 1];
      for (int k = 0; k < size; ++k) {
        ++counts[Integer.bitCount(vectors[k])];
      }
      final List<Z> coefficients = new ArrayList<>(counts.length);
      for (final int count : counts) {
        coefficients.add(Z.valueOf(count));
      }
      histogram.merge(RING.create(coefficients), weight, Z::add);
    } else {
      final int pivot = Integer.lowestOneBit(remaining);
      final int free = all & ~pivots & -(pivot << 1);
      for (int subset = free; ; subset = (subset - 1) & free) {
        final int row = pivot | subset;
        for (int k = 0; k < size; ++k) {
          vectors[size + k] = vectors[k] ^ row;
        }
        subspaces(pivots, remaining ^ pivot, all, vectors, 2 * size, n, weight, histogram);
        if (subset == 0) {
          break;
        }
      }
    }
  }

  private static Polynomial<Z> row(final int n) {
    final int bound = Z.ONE.shiftLeft(n).intValueExact();
    final int[] vectors = new int[bound];
    final Map<Polynomial<Z>, Z> histogram = new HashMap<>();
    // Enumerate each row subspace once by its reduced echelon basis.
    // The subspace-lattice Möbius function is determined by codimension.
    for (int pivots = 0; pivots < bound; ++pivots) {
      final int c = n - Integer.bitCount(pivots);
      final Z weight = ((c & 1) == 0 ? Z.ONE : Z.NEG_ONE).shiftLeft((long) c * (c - 1) / 2);
      subspaces(pivots, pivots, bound - 1, vectors, 1, n, weight, histogram);
    }
    final int max = n * n - n + 1;
    Polynomial<Z> sum = RING.zero();
    for (final Map.Entry<Polynomial<Z>, Z> entry : histogram.entrySet()) {
      if (!entry.getValue().isZero()) {
        sum = RING.add(sum, RING.multiply(RING.pow(entry.getKey(), n, max), entry.getValue()));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mK > mN * mN - mN + 1 || mN == 0) {
      mRow = row(++mN);
      mK = 1;
    }
    return mRow.coeff(mK);
  }
}
