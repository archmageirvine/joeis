package irvine.oeis.a072;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072803.
 * @author Sean A. Irvine
 */
public class A072811 extends Sequence0 {

  private int mN = 0;
  private IntegerPartition mPart = new IntegerPartition(0);

  @Override
  public Z next() {
    int[] p = mPart.next();
    if (p == null) {
      mPart = new IntegerPartition(++mN);
      p = mPart.next();
    }
    return IntegerPartition.multiplicity(p);
  }
}
