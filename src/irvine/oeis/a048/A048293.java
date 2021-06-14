package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048293 Positions of 1-digit terms in the continued fraction for Pi (3 is at position 0).
 * @author Sean A. Irvine
 */
public class A048293 extends A001203 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.compareTo(Z.TEN) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
