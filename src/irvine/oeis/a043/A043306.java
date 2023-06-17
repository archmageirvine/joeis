package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A043306 Sum of all digits in all base-b representations for n, for 2 &lt;= b &lt;= n.
 * @author Sean A. Irvine
 */
public class A043306 extends AbstractSequence {

  /* Construct the sequence. */
  public A043306() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base <= mN; ++base) {
      sum += ZUtils.digitSum(mN, base);
    }
    return Z.valueOf(sum);
  }
}

