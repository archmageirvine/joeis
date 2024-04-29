package irvine.oeis.a016;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016098 Number of crossing set partitions of {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A016098 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int index = ++mN;
    return Functions.BELL.z(index).subtract(Functions.CATALAN.z((long) mN));
  }
}
