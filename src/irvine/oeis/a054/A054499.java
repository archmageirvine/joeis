package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007769;
import irvine.oeis.a047.A047974;

/**
 * A054499 Number of pairings on a bracelet; number of chord diagrams that can be turned over and having n chords.
 * @author Sean A. Irvine
 */
public class A054499 extends A047974 {

  private final Sequence mA = new A007769();
  private Z mT = null;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mT = super.next();
      mA.next();
      return Z.ONE;
    }
    final Z t = mT;
    mT = super.next();
    return mA.next().multiply2().add(mT).add(t).divide(4);
  }
}
