package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066506 Least k &gt; n^2 such that (k^3+1)/(n^2+1) is an integer.
 * @author Sean A. Irvine
 */
public class A066506 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n2 = ++mN * mN;
    final long m = n2 + 1;
    Z k = Z.valueOf(n2);
    while (true) {
      k = k.add(1);
      if (k.pow(3).mod(m) == n2) {
        return k;
      }
    }
  }
}

