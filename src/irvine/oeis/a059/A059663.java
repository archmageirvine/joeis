package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059663 Positions of the flipped bits in the sequence A059459.
 * @author Sean A. Irvine
 */
public class A059663 implements Sequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = Z.TWO;
  {
    mSeen.add(Z.TWO);
  }

  @Override
  public Z next() {
    int k = 0;
    while (true) {
      final Z t = mA.flipBit(k);
      if (!mSeen.contains(t) && t.isProbablePrime()) {
        mA = t;
        break;
      }
      ++k;
    }
    mSeen.add(mA);
    return Z.valueOf(k);
  }
}
