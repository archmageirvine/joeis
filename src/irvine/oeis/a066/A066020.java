package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066020 a(n) is the smallest k such that (k^5 + 1)/(n^5 + 1) is an integer &gt; 1.
 * @author Sean A. Irvine
 */
public class A066020 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final Z m = Z.valueOf(mN).pow(5).add(1);
    while (true) {
      final Z zk = Z.valueOf(++k);
      if (zk.pow(5).add(1).mod(m).isZero()) {
        return zk;
      }
    }
  }
}
