package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063660 Min{ m | m &gt; n and both numbers have at least one common decimal digit}.
 * @author Sean A. Irvine
 */
public class A063660 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n1 = ++mN;
    final int syn = Functions.SYNDROME.i(n1);
    long k = mN;
    while (true) {
      long n = ++k;
      if ((syn & Functions.SYNDROME.i(n)) != 0) {
        return Z.valueOf(k);
      }
    }
  }
}
