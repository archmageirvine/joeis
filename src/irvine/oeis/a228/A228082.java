package irvine.oeis.a228;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A228082.
 * @author Sean A. Irvine
 */
public class A228082 implements Sequence {

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

