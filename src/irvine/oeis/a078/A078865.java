package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A078865 Difference of consecutive primorial numbers divided by 4.
 * @author Sean A. Irvine
 */
public class A078865 extends Sequence1 {

  private final Sequence mA = new A002110().skip();
  private Z mT = mA.next();

  @Override
  public Z next() {
    final Z t = mT;
    mT = mA.next();
    return mT.subtract(t).divide(4);
  }
}
