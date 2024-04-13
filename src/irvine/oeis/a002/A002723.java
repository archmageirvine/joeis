package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import irvine.math.partition.IntegerPartition;
import irvine.math.partition.MultidimensionalIntegerPartition;
import irvine.math.partition.MultidimensionalIntegerPartition.PartitionUser;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A002723 Number of rotatable partitions of [n].
 * @author Sean A. Irvine
 */
public class A002723 extends MemoryFunction1Sequence<Long> {

  /** Construct the sequence. */
  public A002723() {
    super(1);
  }

  // This currently is given different values for later terms
  // It could be an error in the original sequence?

  private static class UnitPartitionFilter implements PartitionUser {
    final PartitionUser mParent;

    UnitPartitionFilter(final PartitionUser parent) {
      mParent = parent;
    }

    @Override
    public void use(final int[][] partition) {
      final int[] lastDimension = partition[partition.length - 1];
      for (int v : lastDimension) {
        if (v != 0) {
          return;
        }
      }
      mParent.use(partition);
    }
  }

  private static class RotatablePartitionFilter implements PartitionUser {
    final PartitionUser mParent;
    RotatablePartitionFilter(final PartitionUser parent) {
      mParent = parent;
    }

    private List<Integer> rotateList(final List<Integer> orig) {
      final List<Integer> rotatedList = new ArrayList<>(orig.size());
      for (int k = 1; k < orig.size(); ++k) {
        rotatedList.add(orig.get(k));
      }
      rotatedList.add(orig.get(0));
      return rotatedList;
    }

    @Override
    public void use(final int[][] partition) {
      final Collection<List<Integer>> ferrier = MultidimensionalIntegerPartition.nodesToFerrier(partition);
      for (final List<Integer> coords : ferrier) {
        if (!ferrier.contains(rotateList(coords))) {
          return;
        }
      }
      mParent.use(partition);
    }
  }

  private int mN = 0;

  private long computeUnitRotatablePartitions(final int dimensions, final int n) {
    final MultidimensionalIntegerPartition partitions = new MultidimensionalIntegerPartition(n, dimensions);
    final MultidimensionalIntegerPartition.CountPartitionUser user = new MultidimensionalIntegerPartition.CountPartitionUser();
    final UnitPartitionFilter unitFilter = new UnitPartitionFilter(new RotatablePartitionFilter(user));
    partitions.generate(unitFilter);
    return user.count();
  }

  @Override
  protected Long compute(final int n) {
    return n == 0 ? 0L : computeUnitRotatablePartitions(dimension(), n);
  }

  protected int dimension() {
    return 4;
  }

  @Override
  public Z next() {
    Z s = Z.ZERO;
    int[] p;
    final IntegerPartition part = new IntegerPartition(++mN);
    while ((p = part.next()) != null) {
      Z t = Z.ONE;
      for (int v : p) {
        t = t.multiply(get(v));
      }
      s = s.add(t);
    }
    return s;
  }
}
