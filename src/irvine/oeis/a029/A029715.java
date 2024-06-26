package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A029715 a(n) = Sum_{k divides 2^n} S(k), where S is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A029715 extends A002034 {

  /** Construct the sequence. */
  public A029715() {
    super(0);
  }

  private Z mA = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mA = mA.add(a(mN));
    mN = mN.multiply2();
    return mA;
  }
}
