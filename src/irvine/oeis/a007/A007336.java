package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A007336 Signature sequence of <code>sqrt 2</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A007336 implements Sequence {

  protected CR getBase() {
    return CR.SQRT2;
  }

  private final TreeSet<Pair<Integer, Integer>> mSeq = new TreeSet<>((a, b) -> {
    final int i0 = a.left();
    final int i1 = b.left();
    if (i0 == i1) {
      return a.right().compareTo(b.right());
    }
    final int j0 = a.right();
    final int j1 = b.right();
    if (j0 == j1) {
      return Integer.compare(i0, i1);
    }
    final CR c0 = getBase().multiply(CR.valueOf(j0)).add(CR.valueOf(i0));
    final CR c1 = getBase().multiply(CR.valueOf(j1)).add(CR.valueOf(i1));
    return c0.compareTo(c1); // Already know they are not equal
  });

  {
    mSeq.add(new Pair<>(1, 1));
  }

  @Override
  public Z next() {
    final Pair<Integer, Integer> ij = mSeq.pollFirst();
    final int i = ij.left();
    final int j = ij.right();
    mSeq.add(new Pair<>(i, j + 1));
    mSeq.add(new Pair<>(i + 1, j));
    return Z.valueOf(i);
  }
}
