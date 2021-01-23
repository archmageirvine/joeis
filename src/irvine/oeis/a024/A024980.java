package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024980 a(n) = position of n^3 + (n+1)^3 + (n+2)^3 in A024975.
 * @author Sean A. Irvine
 */
public class A024980 extends A024975 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).add(Z.valueOf(mM + 1).pow(3)).add(Z.valueOf(mM + 2).pow(3));
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
