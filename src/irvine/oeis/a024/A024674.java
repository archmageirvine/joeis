package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024674 a(n) = position of n^3 + (n+1)^3 in A024670 (distinct sums of cubes of distinct positive integers).
 * @author Sean A. Irvine
 */
public class A024674 extends A024670 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).add(Z.valueOf(mM + 1).pow(3));
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
