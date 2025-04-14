package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005741 Number of fanout-free Boolean functions of n variables using And, Or, Xor, Not, and Majority gates.
 * @author Sean A. Irvine
 */
public class A005741 extends A005740 {

  private Z mA = Z.ZERO;
  private int mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mTerms.get(++mN));
  }

}

