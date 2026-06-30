package irvine.oeis.a355;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A355769 Numbers k such that both k and k+1 can be written as the sum of two nonzero squares.
 * @author Sean A. Irvine
 */
public class A355769 extends A000404 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
