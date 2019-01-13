package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000002;

/**
 * A007782.
 * @author Sean A. Irvine
 */
public class A007782 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    final Z mod = Z.ONE.shiftLeft(++mN);
    mSeen.clear();
    final A000002 kolakoski = new A000002();
    Z state = Z.ZERO;
    // run up
    for (int k = 0; k < mN; ++k) {
      state = state.multiply2().add(kolakoski.next().subtract(1));
    }
    // counting
    int lastNew = 0;
    do {
      if (mSeen.add(state)) {
        lastNew = 0;
      } else {
        ++lastNew;
      }
      state = state.multiply2().add(kolakoski.next().subtract(1)).mod(mod);
    } while (lastNew <= mN * mN * mN);  // n^3 > n^(log(3)/log(3/2)) sufficient
    return Z.valueOf(mSeen.size());
  }
}
