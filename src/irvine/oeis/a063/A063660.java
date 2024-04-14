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
    final int syn = Functions.SYNDROME.i(++mN);
    long k = mN;
    while (true) {
      if ((syn & Functions.SYNDROME.i(++k)) != 0) {
        return Z.valueOf(k);
      }
    }
  }
}
