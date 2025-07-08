package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048388 Replacing digits d in decimal expansion of n with d^2 yields a prime.
 * @author Sean A. Irvine
 */
public class A048388 extends A048385 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      long m = ++mN;
      do {
        sb.append(A048386.EXPANSIONS[(int) (m % 10)]);
        m /= 10;
      } while (m != 0);
      if (new Z(sb.reverse()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
