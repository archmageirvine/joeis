package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004432;

/**
 * A024809 a(n) = position of n^2 + (n+1)^2 + (n+2)^2 in A004432.
 * @author Sean A. Irvine
 */
public class A024809 extends A004432 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().add(Z.valueOf(mM + 1).square()).add(Z.valueOf(mM + 2).square());
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
