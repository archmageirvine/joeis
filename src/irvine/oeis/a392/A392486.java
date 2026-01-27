package irvine.oeis.a392;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A392486 allocated for Courtney Gibbons.
 * @author Sean A. Irvine
 */
public class A392486 extends A392483 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN * mN, k -> super.next());
  }
}

