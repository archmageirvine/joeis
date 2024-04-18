package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035114 Values of phi(n) corresponding to A035113.
 * @author Sean A. Irvine
 */
public class A035114 extends Sequence1 {

  private TreeSet<Z> mInverses = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mInverses.isEmpty()) {
        mN = mN.add(1);
        mInverses = InverseEuler.inversePhi(mN);
      }
      final Z t = mInverses.pollFirst();
      if (t.mod(4) != 2) {
        return mN;
      }
    }
  }
}
