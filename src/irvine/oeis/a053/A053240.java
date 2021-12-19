package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053240 n for which values not equal to 2 occur in the expansion of A053238.
 * @author Sean A. Irvine
 */
public class A053240 extends A053238 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
