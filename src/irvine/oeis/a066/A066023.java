package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065964.
 * @author Sean A. Irvine
 */
public class A066023 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final Z m = Z.valueOf(mN).pow(7).add(1);
    while (true) {
      final Z zk = Z.valueOf(++k);
      if (zk.pow(7).add(1).mod(m).isZero()) {
        return zk;
      }
    }
  }
}
