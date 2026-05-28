package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085069 a(1) =1, then the smallest number a(n)== 1 ( mod a(n-1)) such that tau(a(n))= n.
 * @author Sean A. Irvine
 */
public class A085069 extends Sequence1 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      ++mN;
      long k = 0;
      while (true) {
        final Z t = mA.multiply(++k).add(1);
        if (Functions.SIGMA0.l(t) == mN) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
