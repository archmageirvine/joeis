package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004514;
import irvine.oeis.a008.A008592;

/**
 * A059632 Carryless product 11 X n base 10.
 * @author Sean A. Irvine
 */
public class A059632 extends A004514 {

  private final Sequence mA = new A008592();

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(10, mA.next(), mN);
  }
}

