package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Count cyclic subgroups of AGL(n,2) by the primary types of the linear parts.
 * @author Gregory Morse
 */
public final class BinaryAffineCyclicSubgroups {

  private static final class PrimaryType {
    private final int mDegree;
    private final Z mOrder;
    private final Z mLabels;

    private PrimaryType(final int degree, final Z order) {
      mDegree = degree;
      mOrder = order;
      mLabels = Functions.PHI.z(order).divide(degree);
    }
  }

  private final int mDimension;
  private final List<PrimaryType> mTypes = new ArrayList<>();

  private BinaryAffineCyclicSubgroups(final int dimension) {
    mDimension = dimension;
    for (int d = 1; d <= dimension; ++d) {
      for (final Z t : Jaguar.factor(Z.ONE.shiftLeft(d).subtract(1)).divisors()) {
        if (t.isOne() ? d == 1 : Functions.ORDER.z(t, Z.TWO).equals(Z.valueOf(d))) {
          mTypes.add(new PrimaryType(d, t));
        }
      }
    }
  }

  private Q contribution(final Z odd, final int power, final int[] fixed) {
    // For r = ord(g), S = I + g + ... + g^(r-1) vanishes off the
    // eigenvalue-1 component. A block of length power contributes rank 1.
    // A translation in ker(S) keeps order r; the others double it.
    if (power == 1) {
      // phi(odd) = phi(2 * odd).
      return new Q(Z.ONE.shiftLeft(mDimension), Functions.PHI.z(odd));
    }
    final int rank = fixed != null && power < fixed.length ? fixed[power] : 0;
    return new Q(Z.ONE.shiftLeft(mDimension).add(Z.ONE.shiftLeft(mDimension - rank)), Functions.PHI.z(odd).multiply(power));
  }

  private Q select(final int start, final int n, final Z odd, final int power, final int[] fixed) {
    if (n == 0) {
      return contribution(odd, power, fixed);
    }
    Q sum = Q.ZERO;
    for (int i = start; i < mTypes.size(); ++i) {
      final PrimaryType type = mTypes.get(i);
      if (type.mDegree > n) {
        break;
      }
      final int limit = type.mLabels.min(Z.valueOf(n / type.mDegree)).intValueExact();
      for (int k = 1; k <= limit; ++k) {
        sum = sum.add(assign(i, k, n, odd.lcm(type.mOrder), power, fixed).multiply(Binomial.binomial(type.mLabels, k)));
      }
    }
    return sum;
  }

  private Q assign(final int index, final int count, final int n, final Z odd, final int power, final int[] fixed) {
    if (count == 0) {
      return select(index + 1, n, odd, power, fixed);
    }
    final PrimaryType type = mTypes.get(index);
    Q sum = Q.ZERO;
    for (int m = 1; m <= n / type.mDegree - count + 1; ++m) {
      final IntegerPartition partitions = new IntegerPartition(m);
      int[] parts;
      while ((parts = partitions.next()) != null) {
        final int[] multiplicities = BinaryLinearMatrixCounts.multiplicities(parts);
        final int blockPower = Math.max(1, Integer.highestOneBit(parts[0] - 1) << 1);
        final Q rest = assign(index, count - 1, n - m * type.mDegree, odd, Math.max(power, blockPower),
          type.mOrder.isOne() ? multiplicities : fixed);
        sum = sum.add(rest.divide(GeneralLinearCycleIndex.kung(type.mDegree, multiplicities, 2)));
      }
    }
    return sum;
  }

  /**
   * Number of cyclic subgroups.
   * @param n affine dimension
   * @return subgroup count
   */
  public static Z count(final int n) {
    return new BinaryAffineCyclicSubgroups(n).select(0, n, Z.ONE, 1, null)
      .multiply(LinearGroupOrder.general(n, Z.TWO)).toZ();
  }
}
