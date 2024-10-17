package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A019300 First n elements of Thue-Morse sequence A010060 read as a binary number.
 * @author Sean A. Irvine
 */
public class A019300 extends A010060 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply2().add(super.next());
    return mA;
  }
}

