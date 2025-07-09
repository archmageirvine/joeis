package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A078649 Numbers n such that A000002(n)=A000002(n+1) where A000002 is the Kolakoski sequence.
 * @author Sean A. Irvine
 */
public class A078649 extends A000002 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
