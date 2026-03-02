package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083997 Primes arising in A083996.
 * @author Sean A. Irvine
 */
public class A083997 extends A083996 {

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
