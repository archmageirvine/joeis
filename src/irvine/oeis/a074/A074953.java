package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A074953 Numbers equidistant from consecutive twin prime pairs.
 * @author Georg Fischer
 */
public class A074953 extends Sequence1 {

  private final Sequence mA001359 = new A001359();
  private final Sequence mA006512 = new A006512().skip();

  @Override
  public Z next() {
    return mA006512.next().add(mA001359.next()).divide(Z.TWO);
  }
}
