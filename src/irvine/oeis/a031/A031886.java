package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031886 Lucky numbers with size of gaps equal to <code>4</code> (lower terms).
 * @author Sean A. Irvine
 */
public class A031886 extends A000959 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.FOUR.equals(mA.subtract(t))) {
        return t;
      }
    }
  }
}
