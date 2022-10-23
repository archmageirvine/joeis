package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053181 Composite numbers ending in 9.
 * @author Sean A. Irvine
 */
public class A053181 extends Sequence1 {

  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(10);
      if (!mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}

