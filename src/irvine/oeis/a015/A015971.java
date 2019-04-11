package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015971 k is the first integer such that phi(k <code>+ n)</code> | sigma(k).
 * @author Sean A. Irvine
 */
public class A015971 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Z.ZERO.equals(Cheetah.factor(++k).sigma().mod(Cheetah.factor(mN + k).phi()))) {
        return Z.valueOf(k);
      }
    }
  }
}
