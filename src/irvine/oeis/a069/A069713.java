package irvine.oeis.a069;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068914.
 * @author Sean A. Irvine
 */
public class A069713 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    final FixedLengthPartition part = new FixedLengthPartition(n, m, 1, 6);
    long count = 0;
    while (part.next() != null) {
      ++count;
    }
    return Z.valueOf(count);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

