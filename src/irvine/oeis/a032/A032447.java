package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032447 Inverse function of phi( ).
 * @author Sean A. Irvine
 */
public class A032447 extends Sequence1 {

  private TreeSet<Z> mInverses = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mInverses.isEmpty()) {
      mN = mN.add(1);
      mInverses = Euler.inversePhi(mN);
    }
    return mInverses.pollFirst();
  }
}
