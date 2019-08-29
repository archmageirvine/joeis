package irvine.oeis.a048;

import java.util.HashSet;

import irvine.math.partitions.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A048141 Number of symmetrical planar partitions of n: planar partitions <code>(A000219)</code> that when regarded as 3-D objects have a threefold axis of symmetry that is the intersection of 3 mirror planes, i.e., <code>C3v</code> symmetry.
 * @author Sean A. Irvine
 */
public class A048141 implements Sequence, MultidimensionalIntegerPartition.PartitionUser {

  private int mN = 0;
  private long mCount = 0;

  @Override
  public void use(final int[][] partition) {
    final HashSet<Triple<Integer>> triples = new HashSet<>(partition[0].length);
    for (int k = 0; k < partition[0].length; ++k) {
      triples.add(new Triple<>(partition[0][k], partition[1][k], partition[2][k]));
    }
    for (final Triple<Integer> t : triples) {
      if (!triples.contains(new Triple<>(t.right(), t.left(), t.mid()))
        || !triples.contains(new Triple<>(t.mid(), t.left(), t.right()))) {
        return;
      }
    }
    ++mCount;
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final MultidimensionalIntegerPartition part = new MultidimensionalIntegerPartition(mN, 2);
    part.generate(this);
    return Z.valueOf(mCount);
  }
}

