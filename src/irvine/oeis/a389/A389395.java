package irvine.oeis.a389;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389395 allocated for Rachel L. A. Hunter.
 * @author Sean A. Irvine
 */
public class A389395 extends Sequence1 {

  private final LinkedList<Long> mDivs = new LinkedList<>();
  {
    mDivs.add(1L);
    mDivs.add(1L);
    mDivs.add(2L);
    mDivs.add(1L);
    mDivs.add(1L);
    mDivs.add(2L);
    mDivs.add(3L);
  }
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (mA.compareTo(Z.SIX) > 0) {
      for (final Z d : Jaguar.factor(mA).divisorsSorted()) {
        if (!d.equals(mA)) {
          mDivs.add(d.longValueExact());
        }
      }
    }
    mA = mA.add(mDivs.pollFirst());
    return mA;
  }
}
