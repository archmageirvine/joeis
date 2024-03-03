package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A068631 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Sequence comp = new A002808();
    while (true) {
      final Z c = comp.next();
      final Z s = mSum.add(c);
      if (!s.isProbablePrime() && mSeen.add(c)) {
        mSum = s;
        return c;
      }
    }
  }
}
