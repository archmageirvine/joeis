package irvine.oeis.a336;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A336826.
 * @author Sean A. Irvine
 */
public class A336826 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) > 0) {
      final Z t = mN.multiply(ZUtils.digitProduct(mN));
      if (t.compareTo(mN) >= 0) {
        mA.add(t);
      }
      mN = mN.add(1);
    }
    return mA.pollFirst();
  }
}
