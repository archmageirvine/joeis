package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a027.A027834;

/**
 * A006692 Number of connected n-state finite automata with 3 inputs.
 * @author Sean A. Irvine
 */
public class A006692 extends A027834 {

  private Z mF = Z.ONE;
  private long mN = 0;

  {
    super.next();
  }

  @Override
  protected int getR() {
    return 3;
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().divide(mF);
  }
}

