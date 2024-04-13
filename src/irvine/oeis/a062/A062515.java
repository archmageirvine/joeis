package irvine.oeis.a062;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002110;
import irvine.oeis.memory.MemorySequence;

/**
 * A062515 Leading least prime signatures, ordered by forming the product of primorials greater than 2 with multiplicities given by the canonical sequence of partitions.
 * @author Sean A. Irvine
 */
public class A062515 extends Sequence0 {

  private final MemorySequence mPrimorial = MemorySequence.cachedSequence(new A002110().skip(1)); // We want mPrimorial.a(1) == 6

  private IntegerPartition mPart = new IntegerPartition(1);
  private int mN = 0;

  private int[] nextPartition() {
    final int[] p = mPart.next();
    if (p == null) {
      mPart = new IntegerPartition(++mN);
      return mPart.next();
    }
    return p;
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    final int[] p = nextPartition();
    return Integers.SINGLETON.product(0, p.length - 1, k -> mPrimorial.a(p[k]));
  }
}
