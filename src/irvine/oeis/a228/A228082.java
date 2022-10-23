package irvine.oeis.a228;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A228082 Numbers that are of the form k + sum of binary digits of k for some nonnegative integer k.
 * @author Sean A. Irvine
 */
public class A228082 extends Sequence1 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mSet.isEmpty() || mSet.first().compareTo(mN) >= 0) {
      mSet.add(mN.add(mN.bitCount()));
      mN = mN.add(1);
    }
    return mSet.pollFirst();
  }
}

