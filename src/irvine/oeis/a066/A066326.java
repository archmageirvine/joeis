package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066326 a(1) = 5; for n &gt; 1, a(n) is the least k &gt; 0 not already included such that a(m)^2 + k^2 is a square for some m &lt; n.
 * @author Sean A. Irvine
 */
public class A066326 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.FIVE);
      return Z.FIVE;
    }
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (!mSeen.contains(k)) {
        final Z k2 = k.square();
        for (final Z m : mSeen) {
          if (m.square().add(k2).isSquare()) {
            mSeen.add(k);
            return k;
          }
        }
      }
    }
  }
}
