package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048955 Positions of 2-digit terms in the continued fraction for Pi (3 is at position 0).
 * @author Sean A. Irvine
 */
public class A048955 extends A001203 {

  private static final Z UPPER = Z.valueOf(100);
  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = super.next();
      if (t.compareTo(Z.TEN) >= 0 && t.compareTo(UPPER) < 0) {
        return Z.valueOf(mM);
      }
    }
  }
}
