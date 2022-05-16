package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015971 k is the first integer such that phi(k + n) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015971 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Jaguar.factor(++k).sigma().mod(Jaguar.factor(mN + k).phi()).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
