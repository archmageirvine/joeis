package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084003 Primes arising in A084002.
 * @author Sean A. Irvine
 */
public class A084003 extends A084002 {

  private int mN = 1;
  {
    super.next();
  }

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
