package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063661 a(n) = A063660(n) - n.
 * @author Sean A. Irvine
 */
public class A063661 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n1 = ++mN;
    final int syn = Functions.SYNDROME.i(n1);
    long k = mN;
    while (true) {
      long n = ++k;
      if ((syn & Functions.SYNDROME.i(n)) != 0) {
        return Z.valueOf(k - mN);
      }
    }
  }
}
