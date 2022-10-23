package irvine.oeis.a213;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A213256 p(11n+6) where p(k) = number of partitions of k = A000041(k).
 * @author Sean A. Irvine
 */
public class A213256 extends Sequence0 {

  private int mN = -5;

  @Override
  public Z next() {
    mN += 11;
    return IntegerPartition.partitions(mN);
  }
}
