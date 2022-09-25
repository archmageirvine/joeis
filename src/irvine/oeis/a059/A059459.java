package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059459 a(1) = 2; a(n+1) is obtained by writing a(n) in binary and trying to complement just one bit, starting with the least significant bit, until a new prime is reached.
 * @author Sean A. Irvine
 */
public class A059459 implements Sequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      int k = 0;
      while (true) {
        final Z t = mA.flipBit(k);
        if (!mSeen.contains(t) && t.isProbablePrime()) {
          mA = t;
          break;
        }
        ++k;
      }
    }
    mSeen.add(mA);
    return mA;
  }
}
