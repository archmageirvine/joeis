package irvine.oeis.a213;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A213256 <code>p(11n+6)</code> where <code>p(k) =</code> number of partitions of k <code>= A000041(k)</code>.
 * @author Sean A. Irvine
 */
public class A213256 implements Sequence {

  private int mN = -5;

  @Override
  public Z next() {
    mN += 11;
    return IntegerPartition.partitions(mN);
  }
}
