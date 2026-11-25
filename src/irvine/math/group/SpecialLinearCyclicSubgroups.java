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
 * Count cyclic subgroups of SL(n,4) using general linear conjugacy classes.
 * @author Gregory Morse
 */
public final class SpecialLinearCyclicSubgroups {

  private SpecialLinearCyclicSubgroups() { }

  private static final class PrimaryType {
    private final int mDegree;
    private final Z mOrder;
    private final int mDeterminant;
    private final Z mCount;

    private PrimaryType(final int degree, final Z order, final int determinant, final Z count) {
      mDegree = degree;
      mOrder = order;
      mDeterminant = determinant;
      mCount = count;
    }
  }

  private static List<PrimaryType> types(final int n) {
    final List<PrimaryType> result = new ArrayList<>();
    for (int d = 1; d <= n; ++d) {
      final Z groupOrder = Z.FOUR.pow(d).subtract(1);
      final Z normPower = groupOrder.divide(3);
      for (final Z order : Jaguar.factor(groupOrder).divisors()) {
        if (order.isOne() ? d == 1 : Functions.ORDER.z(order, Z.FOUR).equals(Z.valueOf(d))) {
          final Z count = Functions.PHI.z(order).divide(d);
          if (normPower.mod(order).isZero()) {
            result.add(new PrimaryType(d, order, 0, count));
          } else {
            // Inversion pairs the two nontrivial norms and preserves root order.
            result.add(new PrimaryType(d, order, 1, count.divide2()));
            result.add(new PrimaryType(d, order, 2, count.divide2()));
          }
        }
      }
    }
    return result;
  }

  private static Q use(final List<PrimaryType> types, final int index, final PrimaryType type,
                       final int count, final int n, final Z order, final int det) {
    if (count == 0) {
      return sum(types, index, n, order, det);
    }
    Q acc = Q.ZERO;
    for (int m = 1; m <= n / type.mDegree - count + 1; ++m) {
      final IntegerPartition partitions = new IntegerPartition(m);
      int[] parts;
      while ((parts = partitions.next()) != null) {
        final int[] multiplicities = new int[parts[0] + 1];
        for (final int size : parts) {
          ++multiplicities[size];
        }
        final int power = Integer.highestOneBit(parts[0] - 1) << 1;
        final Z blockOrder = type.mOrder.multiply(Math.max(1, power));
        final Q rest = use(types, index, type, count - 1, n - m * type.mDegree,
          order.lcm(blockOrder), (det + type.mDeterminant * m) % 3);
        acc = acc.add(rest.divide(GeneralLinearCycleIndex.kung(type.mDegree, multiplicities, 4)));
      }
    }
    return acc;
  }

  private static Q sum(final List<PrimaryType> types, final int start, final int n, final Z order, final int det) {
    if (n == 0) {
      return det == 0 ? new Q(Z.ONE, Functions.PHI.z(order)) : Q.ZERO;
    }
    Q acc = Q.ZERO;
    for (int i = start; i < types.size(); ++i) {
      final PrimaryType type = types.get(i);
      if (type.mDegree > n) {
        break;
      }
      final int limit = type.mCount.min(Z.valueOf(n / type.mDegree)).intValueExact();
      for (int k = 1; k <= limit; ++k) {
        acc = acc.add(use(types, i + 1, type, k, n, order, det).multiply(Binomial.binomial(type.mCount, k)));
      }
    }
    return acc;
  }

  /**
   * Count cyclic subgroups in determinant-one matrices over GF(4).
   * @param n matrix dimension
   * @return subgroup count
   */
  public static Z overFour(final int n) {
    // Sum the size of each GL class of determinant one divided by the
    // number of generators of the cyclic subgroup made by each element.
    return sum(types(n), 0, n, Z.ONE, 0).multiply(LinearGroupOrder.general(n, Z.FOUR)).toZ();
  }
}
