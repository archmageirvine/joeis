package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083310 Least number greater than n that contains all the decimal digits of n.
 * @author Sean A. Irvine
 */
public class A083310 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long k = ++mN;
    final int syn = Functions.SYNDROME.i(mN);
    while (true) {
      if ((Functions.SYNDROME.i(++k) & syn) == syn) {
        return Z.valueOf(k);
      }
    }
  }
}
