package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A029714 a(n) = Sum_{k divides 3^n} S(k), where S is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A029714 extends A002034 {

  /** Construct the sequence. */
  public A029714() {
    super(0);
  }

  private Z mA = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mA = mA.add(kempner(mN));
    mN = mN.multiply(3);
    return mA;
  }
}
