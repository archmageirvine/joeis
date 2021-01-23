package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036343 Prime concatenated analog clock numbers read counterclockwise.
 * @author Sean A. Irvine
 */
public class A036343 implements Sequence {

  private final TreeSet<A036342.State> mState = new TreeSet<>();
  {
    for (int k = 1; k <= 12; ++k) {
      mState.add(new A036342.State(Z.valueOf(k), k));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final A036342.State s = mState.pollFirst();
      int next = s.mClock - 1;
      if (next == 0) {
        next = 12;
      }
      mState.add(new A036342.State(new Z(s.mA.toString() + next), next));
      if (s.mA.isProbablePrime()) {
        return s.mA;
      }
    }
  }
}
