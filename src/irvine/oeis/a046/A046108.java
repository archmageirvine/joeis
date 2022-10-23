package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046108 Decimal period of 1/b(n), where b(n) is A046107.
 * @author Sean A. Irvine
 */
public class A046108 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mT = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mN = mN.add(1);
      mT = mT.multiply(10);
      for (final Z p : Jaguar.factor(mT.subtract(1)).toZArray()) {
        if (mSeen.add(p)) {
          mA.add(p);
        }
      }
    }
    mA.pollFirst();
    return mN;
  }
}
