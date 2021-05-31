package irvine.oeis.a048;

import java.util.HashSet;

import irvine.math.partitions.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A048141 Number of symmetrical planar partitions of n: planar partitions (A000219) that when regarded as 3-D objects have a threefold axis of symmetry that is the intersection of 3 mirror planes, i.e., C3v symmetry.
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
    //System.out.println(triples);
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

  // After Wouter Meeussen (private communication)
/*
  overmajorsQ[par : {__Integer}, child : {__Integer}] :=
 Length[par] > Length[child] &&
  Min[Take[Rest[par], Length[child]] - child] > 0
  */
//  private boolean overMajors(final Collection<Integer> par, final Collection<Integer> child) {
//    if (par.size() <= child.size()) {
//      return false;
//    }
//    int min = Integer.MAX_VALUE;
//    final Iterator<Integer> it = par.iterator();
//    it.next();
//    for (final int c : child) {
//      min = Math.min(min, it.next() - c);
//    }
//    return min > 0;
//  }

  /*
  childindx =
   MapIndexed[
    Position[Take[bit, Max[1, First[#2] - First[#1] ]  ],
      p : {__Integer} /; overmajorsQ[#1, p], {2}] &, bit, {2}];]
   */


}

