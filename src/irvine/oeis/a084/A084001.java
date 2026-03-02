package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084001 Primes arising in A084000.
 * @author Sean A. Irvine
 */
public class A084001 extends A084000 {

  private int mN = 0;

  @Override
  public Z next() {
    super.next();
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = mN; k > 0; --k) {
      sb.append(a(k));
    }
    for (int k = 2; k <= mN; ++k) {
      sb.append(a(k));
    }
    return new Z(sb);
  }
}
