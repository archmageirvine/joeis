package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedException;

/**
 * A002936 Solid partitions of n, distinct along rows.
 * @author Sean A. Irvine
 */
public class A002936 extends Sequence1 { //}, MultidimensionalIntegerPartition.PartitionUser {

//  private int mN = 0;
//  private long mCount = 0;
//
//  private boolean isNonzero(final int[] row) {
//    for (final int v : row) {
//      if (v != 0) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  @Override
//  public void use(final int[][] partition) {
//    // todo filtering
//    System.out.println("---");
//    for (final int[] p : partition) {
//      System.out.println(Arrays.toString(p));
//    }
//    // unit partition
//    final int[] lastDimension = partition[partition.length - 1];
//    for (int v : lastDimension) {
//      if (v != 0) {
//        return;
//      }
//    }
//    final Collection<List<Integer>> ferrier = MultidimensionalIntegerPartition.nodesToFerrier(partition);
//    for (final List<Integer> x : ferrier) {
//      x.remove(x.size() - 1);
//    }
//    System.out.println(ferrier);
//    mCount++;
//  }

  @Override
  public Z next() {
//    mCount = 0;
//    final MultidimensionalIntegerPartition part = new MultidimensionalIntegerPartition(++mN, 4);
//    part.generate(this);
//    return Z.valueOf(mCount);
    throw new UnimplementedException();
  }

}

