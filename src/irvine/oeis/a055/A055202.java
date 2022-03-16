package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a016.A016067;

/**
 * A055202 Smallest integer that can be expressed as p+2m^2 in more ways than any smaller number, where m &gt;= 0 and p = 1 or prime.
 * @author Sean A. Irvine
 */
public class A055202 extends A016067 {

  private long mRecord = 0;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long rep = countRepresentations(mN);
      if (rep > mRecord) {
        mRecord = rep;
        return Z.valueOf(mN);
      }
    }
  }
}
