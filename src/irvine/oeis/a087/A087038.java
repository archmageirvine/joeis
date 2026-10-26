package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087019 Lunar squares: n*n where * is lunar multiplication (A087062).
 * @author Sean A. Irvine
 */
public class A087038 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Z.valueOf(++k).pow(k).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
