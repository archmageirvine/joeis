package irvine.oeis.a366;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A366896 allocated for Giorgos Kalogeropoulos.
 * @author Sean A. Irvine
 */
public class A366896 extends Sequence0 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long t = 1;
    long k = 0;
    while (true) {
      if (++k == t) {
        mA = mA.multiply(10);
        t *= 10;
      }
      if (!mUsed.contains(k) && Jaguar.factor(mA.add(k)).omega() == mN) {
        mA = mA.add(k);
        mUsed.add(k);
        return Z.valueOf(k);
      }
    }
  }
}
