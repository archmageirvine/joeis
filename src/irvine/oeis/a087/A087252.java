package irvine.oeis.a087;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a025.A025586;

/**
 * A087252 Numbers that are divisible by 4, but cannot be the largest peak value in a 3x+1 trajectory, regardless of the initial value.
 * @author Sean A. Irvine
 */
public class A087252 extends A025586 {

  private final HashSet<Z> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      if (m.mod(4) == 0) {
        mSeen.add(m);
      }
      if (mN.mod(4) == 0 && !mSeen.remove(mN)) {
        return mN;
      }
    }
  }
}

