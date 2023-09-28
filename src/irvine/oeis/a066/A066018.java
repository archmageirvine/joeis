package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066018 a(n) is the smallest k such that (k^4 + 1)/(n^4 + 1) is an integer &gt; 1.
 * @author Sean A. Irvine
 */
public class A066018 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final Z m = Z.valueOf(mN).pow(4).add(1);
    while (true) {
      final Z zk = Z.valueOf(++k);
      if (zk.pow(4).add(1).mod(m).isZero()) {
        return zk;
      }
    }
  }
}
