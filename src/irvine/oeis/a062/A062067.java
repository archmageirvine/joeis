package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062067 a(1) = 1; a(n) is smallest square &gt; a(n-1) such that a(n) + a(n-1) is a prime.
 * @author Sean A. Irvine
 */
public class A062067 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z root = mA.sqrt();
      while (true) {
        root = root.add(1);
        final Z s = root.square();
        if (s.add(mA).isProbablePrime()) {
          mA = s;
          break;
        }
      }
    }
    return mA;
  }
}

