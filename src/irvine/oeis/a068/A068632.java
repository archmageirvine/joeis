package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A068632 a(1) = 2; a(n+1) = smallest composite number not in the sequence such that the sum of all the terms is prime.
 * @author Sean A. Irvine
 */
public class A068632 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.TWO;
      return Z.TWO;
    }
    final Sequence comp = new A002808();
    while (true) {
      final Z c = comp.next();
      final Z s = mSum.add(c);
      if (s.isProbablePrime() && mSeen.add(c)) {
        mSum = s;
        return c;
      }
    }
  }
}
