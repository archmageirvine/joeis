package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085897 Group the natural numbers such that the product of the n-th group is divisible by 2^n. (1), (2), (3,4), (5,6,7,8), (9,10,11,12,13,14), (15,16,17,18), ... Sequence contains the first term of the groups.
 * @author Sean A. Irvine
 */
public class A085897 extends Sequence0 {

  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    long e = 0;
    long s = mM + 1;
    do {
      e += Functions.VALUATION.l(++mM, 2);
    } while (e < mN);
    return Z.valueOf(s);
  }
}
