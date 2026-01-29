package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003072;

/**
 * A389852 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A389852 extends Sequence1 {

  private final Sequence mS = new A003072();
  private Z mA = mS.next();
  private final HashSet<Z> mReps = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long d = 0;
    while (true) {
      final Z t = Z.valueOf(++d).pow(3).add(mN);
      while (t.compareTo(mA) >= 0) {
        mReps.add(mA);
        mA = mS.next();
      }
      if (mReps.contains(t)) {
        return Z.valueOf(d);
      }
    }
  }
}
