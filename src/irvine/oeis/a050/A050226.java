package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a006.A006218;

/**
 * A050226 Numbers m such that m divides Sum_{k = 1..m} A000005(k).
 * @author Sean A. Irvine
 */
public class A050226 extends A006218 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
