package irvine.oeis.a027;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027293 Triangular array given by rows: P(n,k) = number of partitions of n that contain k as a part.
 * @author Sean A. Irvine
 */
public class A027293 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return IntegerPartition.partitions(mN - mM);
  }
}

