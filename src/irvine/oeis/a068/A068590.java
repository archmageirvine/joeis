package irvine.oeis.a068;

import irvine.math.MemoryFunction1;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.CycleIndexReadBigN;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068590 Number of different Euler multigraphs with n edges, loops allowed.
 * @author Sean A. Irvine
 */
public class A068590 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<CycleIndex> mS = new MemoryFunction1<>() {
    @Override
    protected CycleIndex compute(final int n) {
      return n < 1 ? CycleIndex.ONE : SymmetricGroup.create(n).cycleIndex();
    }
  };

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      CycleIndex a = CycleIndex.ONE;
      for (int k = 1; k < c.length; ++k) {
        if (c[k] > 0) {
          final CycleIndex ci = mS.get(c[k]).wreath(mS.get(2 * k));
          a = a.op(StandardMultiply.OP, ci);
        }
      }
      final CycleIndex b = mS.get(mN).wreath(mS.get(2));
      sum = sum.add(CycleIndexReadBigN.bigN(a, b).toZ());
    }
    return sum;
  }
}

