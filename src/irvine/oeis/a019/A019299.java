package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a010.A010059;

/**
 * A019299 First n elements of Thue-Morse sequence A010059 read as a binary number.
 * @author Sean A. Irvine
 */
public class A019299 extends A010059 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.shiftLeft(1).add(super.next());
    return mA;
  }
}

