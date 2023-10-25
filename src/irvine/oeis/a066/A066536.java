package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066536 Number of ways of writing n as a sum of n+1 squares.
 * @author Sean A. Irvine
 */
public class A066536 extends A066535 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN + 1);
  }
}
