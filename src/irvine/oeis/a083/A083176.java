package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083176 Arithmetic means of rows of A083173.
 * @author Sean A. Irvine
 */
public class A083176 extends A083173 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, j -> super.next()).divide(mN + 1);
  }
}

