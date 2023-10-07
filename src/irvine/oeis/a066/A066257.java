package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066257 a(n) is the smallest number &gt;1 of the form (k^2+n)/(n^2+k).
 * @author Sean A. Irvine
 */
public class A066257 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long n2 = ++mN * mN;
    long k = 0;
    while (true) {
      final long a = ++k * k + mN;
      final long b = n2 + k;
      if (a > b && a % b  == 0) {
        return Z.valueOf(a / b);
      }
    }
  }
}
