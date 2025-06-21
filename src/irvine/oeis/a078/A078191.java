package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078191 a(n) = concatenation of n n times divided by n.
 * @author Sean A. Irvine
 */
public class A078191 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN).repeat(mN)).divide(mN);
  }
}

