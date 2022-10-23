package irvine.oeis.a047;

import irvine.math.IntegerUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A047726 Number of different numbers that are formed by permuting digits of n.
 * @author Sean A. Irvine
 */
public class A047726 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    return Binomial.multinomial((int) IntegerUtils.sum(cnts), cnts);
  }
}
