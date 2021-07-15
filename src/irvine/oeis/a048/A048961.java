package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048961 Positions of 5-digit terms in the continued fraction for pi (3 is position 0).
 * @author Sean A. Irvine
 */
public class A048961 extends A001203 {

  private static final Z LOWER = Z.valueOf(10000);
  private static final Z UPPER = Z.valueOf(100000);
  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = super.next();
      if (t.compareTo(LOWER) >= 0 && t.compareTo(UPPER) < 0) {
        return Z.valueOf(mM);
      }
    }
  }
}
