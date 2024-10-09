package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061092.
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
