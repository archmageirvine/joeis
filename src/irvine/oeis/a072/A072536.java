package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072536 a(1) = 2, a(2) = 3, a(3) = 5 and a(n) = the smallest prime which is a linear combination of previous three terms with all coefficients &gt;=1.
 * @author Sean A. Irvine
 */
public class A072536 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      if (mB == null) {
        mB = Z.THREE;
        return Z.THREE;
      }
      mC = Z.FIVE;
      return Z.FIVE;
    }
    final TreeSet<Z> s = new TreeSet<>();
    s.add(mA.add(mB).add(mC));
    while (true) {
      final Z t = s.pollFirst();
      if (t.isProbablePrime()) {
        mA = mB;
        mB = mC;
        mC = t;
        return t;
      }
      s.add(t.add(mA));
      s.add(t.add(mB));
      s.add(t.add(mC));
    }
  }
}
