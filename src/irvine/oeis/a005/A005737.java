package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005737 Number of fanout-free Boolean functions of n variables using And, Or and Not gates.
 * @author Sean A. Irvine
 */
public class A005737 extends A005736 {

  private Z mA = super.next();
  private int mN = -1;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mTerms.get(++mN));
  }

}

