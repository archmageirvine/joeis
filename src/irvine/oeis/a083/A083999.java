package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083999 Primes arising in A083998.
 * @author Sean A. Irvine
 */
public class A083999 extends A083998 {

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
