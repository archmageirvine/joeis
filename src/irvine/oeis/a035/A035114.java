package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035114 Values of phi(n) corresponding to A035113.
 * @author Sean A. Irvine
 */
public class A035114 implements Sequence {

  private TreeSet<Z> mInverses = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mInverses.isEmpty()) {
        mN = mN.add(1);
        mInverses = Euler.inversePhi(mN);
      }
      final Z t = mInverses.pollFirst();
      if (t.mod(4) != 2) {
        return mN;
      }
    }
  }
}
