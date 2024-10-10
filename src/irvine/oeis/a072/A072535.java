package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072535 a(1) = 2, a(2) = 3 and a(n) = the smallest prime which is a linear combination of a(n-1) and a(n-2) of the form r*a(n-1) + s*a(n-2) with r,s &gt;=1.
 * @author Sean A. Irvine
 */
public class A072535 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final TreeSet<Z> s = new TreeSet<>();
    s.add(mA.add(mB));
    while (true) {
      final Z t = s.pollFirst();
      if (t.isProbablePrime()) {
        mA = mB;
        mB = t;
        return t;
      }
      s.add(t.add(mA));
      s.add(t.add(mB));
    }
  }
}
