package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065074 Near-repunit primes that contain the digit 0.
 * @author Sean A. Irvine
 */
public class A065074 extends Sequence1 {

  private final StringBuilder mRep = new StringBuilder("1");
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mRep.append(1);
      for (int k = 1; k < mRep.length(); ++k) {
        final Z t = new Z(mRep.substring(0, k) + '0' + mRep.substring(k));
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
    }
    return mA.pollFirst();
  }
}

